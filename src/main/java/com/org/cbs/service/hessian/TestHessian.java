package com.org.cbs.service.hessian;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.pcitc.cbs.hessiancommon.PayStateService;

// @ContextConfiguration(locations = { "classpath:/hessian-client.xml" })
public class TestHessian {
	@Test
	public void testService() throws MalformedURLException {
		Map<String, Object> parms = new HashMap<String, Object>();
		// Map<String, Object> map = new HashMap<String, Object>();
		String url = "http://localhost:8080/fsscbs/hessian/PayState";
		HessianProxyFactory factory = new HessianProxyFactory();
		PayStateService helloService = (PayStateService) factory.create(PayStateService.class, url);
		// String ss = helloService.queryState("BX-X360201604001648");
		// map.put("localSystemId", "ERS");
		// Map<String, Object> map = new HashMap<String, Object>();
		// map.put("SQCODE", "ZF-5520201612000318");
		// map.put("SQBILLCHECKDATE", "20161222");
		// map.put("OPEREMPCODE", "00139664");
		// map.put("OPERNAME", "夏彬涛");
		// map.put("OPERLOGIN", "xiabt.jsyt");
		// map.put("OPERTYPE", "");
		// map.put("SFIELD0", "");
		// map.put("SFIELD1", "2.0#2.0");
		// boolean bb = helloService.setPaperScanStatus("ZF-1620201701000578",
		// map);
		// System.out.println(ss);
		// map = helloService.returnVoucher(parms);
		System.out.println(helloService.isPaperScanAvailable("ZF-1620201612000006"));
		// helloService.lock("BX-4050201608000104", "TY", "", "");
		// map = helloService.returnVoucher(parms);
		// parms.put("OPEREMPCODE", null);
		// parms.put("SQBILLCHECKDATE", "20161206");
		// parms.put("SFIELD1", "1.0#1.0");
		// parms.put("SQCODE", "ZF-1620201612000038");
		// parms.put("OPERNAME", "超级管理员");
		// parms.put("OPERLOGIN", "admin");
		// String ss = helloService.queryState("BX-X360201604001648");
		// System.out.println(ss);
		// boolean bb = helloService.setPaperScanStatus("ZF-1620201612000038",
		// parms);
		// System.out.println(bb);
		// String ss = helloService.checkPaperState("ZF-X210201609001307",
		// "BACK");
		// Map<String,String>
		// BX-X360201604001648
		// map=helloService.isPaperScanAvailable("ZF-1460201611000157");
		// helloService.assignCallBack(null);

		System.out.println("1o2");
	}
	// @Test
	// public void testHessian() {
	// System.out.println(1);
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("hessian-client.xml");
	// PayStateService hello = (PayStateService)
	// context.getBean("hessianClient");
	// Map map = new HashMap();
	// map.put("a", "ss");
	// }

}
