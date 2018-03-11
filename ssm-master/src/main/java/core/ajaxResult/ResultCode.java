package core.ajaxResult;
/**

 *  create by Liujishuai on 2015骞�鏈�1鏃�

 */
public enum ResultCode {
	 /**
     * 鎴愬姛. ErrorCode : 0
     */
    SUCCESS("0","鎴愬姛"),
    /**
     * 鏈煡寮傚父. ErrorCode : 01
     */
    UnknownException("01","鏈煡寮傚父"),
    /**
     * 绯荤粺寮傚父. ErrorCode : 02
     */
    SystemException("02","绯荤粺寮傚父"),
    /**
     * 涓氬姟閿欒. ErrorCode : 03
     */
    MyException("03","涓氬姟閿欒"),
    /**
     * 鎻愮ず绾ч敊璇� ErrorCode : 04
     */
    InfoException("04", "鎻愮ず绾ч敊璇�"),
    /**
     * 鏁版嵁搴撴搷浣滃紓甯� ErrorCode : 020001
     */
    DBException("020001","鏁版嵁搴撴搷浣滃紓甯�"),
    /**
     * 鍙傛暟楠岃瘉閿欒. ErrorCode : 040001
     */
    ParamException("040001","鍙傛暟楠岃瘉閿欒");

    private String _code;
    private String _msg;

    private ResultCode(String code, String msg){
        _code = code;
        _msg = msg;
    }

    public String getCode(){
        return _code;
    }
    public String getMsg(){
        return _msg;
    }

    public static ResultCode getByCode(String code){
        for(ResultCode ec : ResultCode.values()){
            if(ec.getCode().equals(code)){
                return ec;
            }
        }

        return null;
    }
}

