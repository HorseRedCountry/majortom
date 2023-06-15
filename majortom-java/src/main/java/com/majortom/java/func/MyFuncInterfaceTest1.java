package com.majortom.java.func;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/6/15 18:02
 **/
public class MyFuncInterfaceTest1 {
    public static void execute(Runnable runnable){
        runnable.run();
    }

    public static void main(String[] args){
        execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名对象Run...");
            }
        });
        execute(()-> System.out.println("使用Lambda"));
        UserService userService = new UserService();
        execute(()-> userService.wrapPrintln());
        execute(userService::wrapPrintln);
    }

    static class UserService{
        public void wrapPrintln(){
            System.out.println("包装后的Sout");
        }

        public void anotherMethod(){
            System.out.println("另一个方法");
        }

    }
}
