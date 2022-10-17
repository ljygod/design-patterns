package simpleFactoryMethod;

public class OperateFactory {

    public static Operate createOperate(String sign) {
        switch (sign){
            case "+":
                return new AddOperate();
            case "-":
                return new SubOperate();
            default:
                return null;
        }
    }

}
