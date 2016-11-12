package com.xzhang.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportUtil {
	/**
	 * yyyy-mm 转成从开始时间到结束时间的集合
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static List<String> convertTimeToList(String startTime,String endTime){
		String[] startTimes = startTime.split("-");
		String[] endTimes = endTime.split("-");
		List<String> times = new ArrayList<String>();
		int year = Integer.valueOf(endTimes[0]) - Integer.valueOf(startTimes[0]);
		if(year == 0){
			if(Integer.valueOf(startTimes[1]) == 1){
				times.add((Integer.valueOf(startTimes[0])-1) +"-12");
			}else{
				times.add(startTimes[0]+"-"+ buildZero((Integer.valueOf(startTimes[1])-1)));
			}
			for(int i = Integer.valueOf(startTimes[1]);i<=Integer.valueOf(endTimes[1]); i++){
				times.add(startTimes[0]+"-"+buildZero(i));
			}
		}else{
			for(int i = Integer.valueOf(startTimes[1]);i<=12; i++){
				times.add(startTimes[0]+"-"+buildZero(i));
			}
			if(year > 1){
				for(int i = 1;i<year;i++){
					for(int x = 1;x<=12;x++){
						times.add((Integer.valueOf(startTimes[0])+i)+"-"+buildZero(x));
					}
				}
			}
			
			for(int i = 1;i<=Integer.valueOf(endTimes[1]); i++){
				times.add(endTimes[0]+"-"+buildZero(i));
			}
		}
		return times;
	}
	/**
	 * 把list变成map 
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static List<Map<String,Date>> convertTimeToMap(String startTime,String endTime){
		List<String> times = convertTimeToList(startTime, endTime);
		List<Map<String,Date>> dates = new ArrayList<Map<String,Date>>();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			for(int i = 0;i<times.size()-1;i++){
				Map<String,Date> map = new HashMap<String, Date>();
				map.put("startDate", sf.parse(times.get(i)+"-"+getMonthCount(times.get(i))));
				map.put("endDate", sf.parse(times.get(i+1)+"-"+getMonthCount(times.get(i+1))));
				dates.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dates;
	}
	/**
	 * 根据传入的时间格式2015-07 计算出该月有多少天
	 * @param str
	 * @return
	 */
	public static int getMonthCount(String str){
		String[] strs = str.split("-");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,Integer.valueOf(strs[0]));
		cal.set(Calendar.MONTH, Integer.valueOf(strs[1]) - 1);//Java月份才0开始算
		int dateOfMonth = cal.getActualMaximum(Calendar.DATE);
		return dateOfMonth;
	}
	/**
	 * 补零
	 * @param str
	 * @return
	 */
	public static String buildZero(int str){
		if(str<10){
			return "0"+str;
		}
		return str+"";
	}
	
	public static void main(String[] args) {
		List<Map<String,Date>> result = ReportUtil.convertTimeToMap("2015-06", "2015-08");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		for (Map<String, Date> map : result) {
			System.out.println("startDate ===>>"+sf.format(map.get("startDate")) +"====endDate=====>>"+sf.format(map.get("endDate")));
		}
	}
}
