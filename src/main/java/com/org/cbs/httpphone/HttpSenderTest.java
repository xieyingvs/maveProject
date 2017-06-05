package com.org.cbs.httpphone;

public class HttpSenderTest {
	public static void main(String[] args) {
		String url = "http://sapi.253.com/msg/";// 应用地址
//		String url = "http://sapi.253.com/msg/QueryBalance";
		String account = "jk_cs_bj01";// 账号
		String pswd = "5ghj32DHE158";// 密码
		String mobile = "15333319753,15321958271";// 手机号码，多个号码使用","分割
		String msg = "您好,你是吗---!";// 短信内容
		boolean needstatus = true;// 是否需要状态报告，需要true，不需要false
		String extno = null;// 扩展码

		try {
			String returnString = HttpSender.batchSend(url, account, pswd, mobile, msg, needstatus, extno);
			System.out.println(returnString);
			// TODO 处理返回值,参见HTTP协议文档
		} catch (Exception e) {
			// TODO 处理异常
			e.printStackTrace();
		}
	}
}
