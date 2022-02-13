package starter.utils;

public class Endpoint {


    public String Baseurl = "http://pretest-qa.dcidev.id";
    public String register= Baseurl+"/api/v1/register";
    public String Otprequest= Baseurl+"/api/v1/register/otp/request";
    public String otpmatch= Baseurl+"/api/v1/register/otp/match";
    public String signin=Baseurl+"/api/v1/oauth/sign_in";
    public String authget = Baseurl + "/api/v1/oauth/credentials";
    public String revoke= Baseurl + "/api/v1/oauth/revoke";
    public String careerprofile= Baseurl+ "/api/v1/profile/career";
    public String education= Baseurl + "/api/v1/profile/education";
    public  String profile= Baseurl+"/api/v1/profile";
    public String GetdetailProfile=Baseurl+"/api/v1/profile/me";
    public String GetMessage= Baseurl+"/api/v1/message/send";
    public String Getmessagereal= Baseurl+"/api/v1/message/";
    public String Uploadprofile= Baseurl+"/api/v1/uploads/profile";
    public String UploadprofileCover= Baseurl+"/api/v1/uploads/cover";
    public String Uploaddefault= Baseurl+"/api/v1/uploads/profile/default ";



    public char angka = (char)('1'+Math.random()*('0'-'9'+1));
    public char huruf2 = (char)('A'+Math.random()*('Z'-'A'+1));




}
