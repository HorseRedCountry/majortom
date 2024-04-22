package com.majortom.kmcloud.ai.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.majortom.kmcloud.ai.demo.utils.HttpUtils;
import org.assertj.core.util.Lists;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2024/3/28 13:34
 **/
@RestController
@RequestMapping(value = "/kmsoft/ai")
public class MainController {

    @GetMapping(value = "/index")
    public ModelAndView getIndex(Model model) {
        //查询，获取知识库列表
        String result = HttpUtils.doGet("http://192.168.20.165:7861/knowledge_base/list_knowledge_bases");
        JSONObject parse = JSONObject.parseObject(result);
        List<String> resultList = Lists.newArrayList();
        for (Object data : parse.getJSONArray("data")) {
            resultList.add(data.toString());
        }
        //返回
        model.addAttribute("comboValue", resultList);
        return new ModelAndView("index", "model", model);
    }

    @GetMapping(value = "/query")
    public String query(@RequestParam("queryStr") String queryStr, @RequestParam("sel") String sel) {
        JSONObject jsonObject = getJSONObject();
        jsonObject.put("knowledge_base_name", sel);
        jsonObject.put("query", queryStr);
        //查询，获取知识库列表
        String result = HttpUtils.doPost("http://192.168.20.165:7861/chat/knowledge_base_chat", jsonObject.toJSONString());
        JSONObject jsonObject1 = JSONObject.parseObject(result);
        String answer = jsonObject1.getString("answer");
        String parseAnswer = answer.replace("\n\n", "</BR></BR>").replace("\n", "</BR>");
        System.out.println(parseAnswer);
        return jsonObject1.getString("answer");
    }

    private JSONObject getJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("top_k", 3);
        jsonObject.put("score_threshold", 1);
        jsonObject.put("stream", false);
        jsonObject.put("model_name", "chatglm3-6b");
        jsonObject.put("temperature", 0.7);
        jsonObject.put("max_tokens", 0);
        jsonObject.put("prompt_name", "default");
        return jsonObject;
    }

}
