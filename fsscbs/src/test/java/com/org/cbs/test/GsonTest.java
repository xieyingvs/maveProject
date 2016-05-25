package com.org.cbs.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.org.cbs.model.Student;
import com.org.cbs.model.Teacher;
import com.org.cbs.model.User;

import junit.framework.TestCase;

public class GsonTest extends TestCase {

	@Test
	public void test() {
		
		System.out.println(Sun.RED.toString());
		System.out.println(12);

	}

	Gson gson = new Gson();
	// @Test
	// public void test() {
	//
	// Gson gson = new
	// GsonBuilder().enableComplexMapKeySerialization().create();
	// Map<User, String> map1 = new LinkedHashMap<User, String>();//
	// 使用LinkedHashMap将结果按先进先出顺序排列
	// map1.put(new User("1", "10"), "a");
	// map1.put(new User("2", "16"), "b");
	// String s = gson.toJson(map1);
	// System.out.println(s);// 结果:[[{"x":5,"y":6},"a"],[{"x":8,"y":8},"b"]]
	//
	// Map<User, String> retMap = gson.fromJson(s, new TypeToken<Map<User,
	// String>>() {
	// }.getType());
	// for (User p : retMap.keySet()) {
	// System.out.println("key:" + p + " values:" + retMap.get(p));
	// }
	// System.out.println(retMap);
	// System.out.println("----------------------------------");
	// Map<String, User> map2 = new LinkedHashMap<String, User>();
	// map2.put("a", new User("1", "12"));
	// map2.put("b", new User("2", "15"));
	// String s2 = gson.toJson(map2);
	// System.out.println(s2);
	//
	// Map<String, User> retMap2 = gson.fromJson(s2, new TypeToken<Map<String,
	// User>>() {
	// }.getType());
	// for (String key : retMap2.keySet()) {
	// System.out.println("key:" + key + " values:" + retMap2.get(key));
	// }
	// }

	// @Test
	// public void test2() {
	// User user = new User();
	// user.setId("1");
	// user.setName("赵云");
	// user.setAge("20");
	// User user1 = new User();
	// user1.setId("2");
	// user1.setName("白起");
	// user1.setAge("20");
	// List<User> list = new ArrayList<User>();
	// list.add(user);
	// list.add(user1);
	// String str = gson.toJson(list);
	// System.out.println(str);
	// List<User> list1 = gson.fromJson(str, new TypeToken<List<User>>() {
	// }.getType());
	// System.out.println(list1);
	// System.out.println(12);
	// }
	//
	// @Test
	// public void test1() {
	// // 转化json 解析json为java对象
	// User user = new User();
	// user.setId("1");
	// user.setName("赵云");
	// user.setAge("20");
	// Gson gson = new Gson();
	// String str = gson.toJson(user);
	// System.out.println(str);
	// User ss = gson.fromJson(str, User.class);
	// System.out.println(ss);
	// System.out.println(12);
	// }

}
