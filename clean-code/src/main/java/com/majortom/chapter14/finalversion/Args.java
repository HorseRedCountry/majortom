package com.majortom.chapter14.finalversion;

import java.util.*;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/9/19 21:52
 **/
public class Args {

    private Map<Character, ArgumentMarshaler> marshalers;

    private Set<Character> argsFound;

    private ListIterator<String> currentArgument;

    public Args(String scheme,String[] args) throws ArgsException{
        marshalers=new HashMap<Character, ArgumentMarshaler>();
        argsFound=new HashSet<Character>();
    }

    private void parseSchema(String schema) throws ArgsException{
        for (String element : schema.split(",")) {
            if (element.length()>0){
                parseSchemaElement(element.trim());
            }
        }
    }

    private void parseSchemaElement(String element) throws ArgsException{
        char elementId=element.charAt(0);
        String elementTail = element.substring(1);
        validateSchemaElementId(elementId);
        if (elementTail.length()==0){
            marshalers.put(elementId,new BooleanArgumentMarshaler());
        }else if (elementTail.equals("*")){
            marshalers.put(elementId,new StringArgumentMarshaler());
        }else if (elementTail.equals("#")){
            marshalers.put(elementId,new IntegerArgumentMarshaler());
        }else if (elementTail.equals("##")){
            marshalers.put(elementId,new DoubleArgumentMarshaler());
        }else if (elementTail.equals("[*]")){
            marshalers.put(elementId,new StringArrayArgumentMarshaler());
        }else{
            throw  new ArgsException(ErrorCode.INVALID_ARGUMENT_FORMAT,elementId,null);
        }
    }

    private void validateSchemaElementId(char elementId) throws ArgsException{
        if (!Character.isLetter(elementId)){
            throw new ArgsException(ErrorCode.INVALID_ARGUMENT_NAME,elementId,null);
        }
    }

    private void parseArgumentStrings(List<String> argsList) throws ArgsException{
        for (currentArgument=argsList.listIterator();currentArgument.hasNext();){
            String argString=currentArgument.next();
            if (argString.startsWith("-")){
                parseArgumentCharacters(argString.substring(1));
            }else {
                currentArgument.previous();
                break;
            }
        }
    }

    private void parseArgumentCharacters(String argsChars) throws ArgsException{
        for (int i = 0; i < argsChars.length(); i++) {
            parseArgumentCharacter(argsChars.charAt(i));
        }
    }

    private void parseArgumentCharacter(char argChar) throws ArgsException{
        ArgumentMarshaler m = marshalers.get(argChar);
        if (null==m){
            throw new ArgsException(ErrorCode.UNEXPECTED_ARGUMENT,argChar,null);
        }else{
            argsFound.add(argChar);
            try {
                m.set(currentArgument);
            }catch (ArgsException e){
                e.setErrorArgumentId(argChar);
                throw e;
            }
        }
    }

    public boolean has(char arg){
        return argsFound.contains(arg);
    }

    public int nextArgument(){
        return currentArgument.nextIndex();
    }



}
