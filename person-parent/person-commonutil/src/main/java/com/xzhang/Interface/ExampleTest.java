package com.xzhang.Interface;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @Title: ExampleTest.java
 * @Package: com.xzhang.Interface
 * @Description: 接口测试代码（仅供模仿m,并没有写在系统里）
 * 
 ******************************************************** 
 * Date				Author 		Changes 
 * 2016年10月19日	        zx			创建
 ******************************************************** 
 */
public class ExampleTest {
	
	public static void main(String[] args) {
		Map<String, String> param = new TreeMap<String, String>();
	    param.put("sorgcode", MerchantAttrs.orgcode);
	    param.put("mobileNum", "");
	    param.put("imsi", "460000000174133");
	    //请求hash转换
	    MerchantUtil.hash(param);
	    String result = MerchantUtil.sendPost(MerchantAttrs.apiURL2+"/channel/8002/", param, MerchantAttrs.charset);
	    System.out.println(result);
	    
	    ObjectMapper mapper = new ObjectMapper();
//	    try {
//			//把返回结果转换成对应的dto对象
//	    	BlackMobileDto vo = mapper.readValue(result, BlackMobileDto.class);
//			if(null != vo && "true".equals(vo.getSuccess()) && "1".equals(vo.getStatus()) 
//					&& null != vo.getData()){
//				if(null == bmList || bmList.size()<=0){
//					BlackMobileOthersDto dto = vo.getData();
//					List<InstmtBlackMobile> bmListNew = dto.getOthers();
//					if(null != bmListNew && bmListNew.size()>0){
//						for(InstmtBlackMobile bm : bmListNew){
//							bm.setBuyer_id(buyerId);
//							try {
//								bm.setCreateTime(sf.parse(sf.format(date)));
//							} catch (ParseException e) {
//								e.printStackTrace();
//							}
//							//保存bm
//							this.suanHuaApiDao.saveInstmtBlackMobile(bm);
//						}
//					}
//				}
//			}
//		} catch (JsonParseException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	    
	    
	}

}
