package com.xzhang.date;



import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ʱ�乤��
 * @author liuxl, wangyilin
 *
 */
public final class DateUtility
{
    /**
     * Number of milliseconds in a standard second.
     */
    public static final long MILLIS_PER_SECOND = 1000;// һ���ӵĺ�����
    
    /**
     * Number of milliseconds in a standard minute.
     */
    public static final long MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;// һ���ӵĺ�����

    /**
     * Number of milliseconds in a standard hour.
     */
    public static final long MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;// һСʱ�ĺ�����

    /**
     * Number of milliseconds in a standard day.
     */
    public static final long MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;// һ��ĺ�����
    
    /**
     * ISO8601 date format: yyyy-MM-dd
     */
    public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";
    
    /**
     *  date format: yyyyMMdd
     */
    public static final String DATEYMD_FORMAT_PATTERN = "yyyyMMdd";

    /**
     * ISO8601 date-time format: yyyy-MM-dd HH:mm:ss
     */
    public static String DATETIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";
    
    private DateUtility()
    {
        
    }
    
    /**
     * ��õ�ǰʱ��yyyy-MM-dd HH:mm:ss��ʽ
     * @return
     */
    public static String getCurrentDateAsString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat(DATETIME_FORMAT_PATTERN);

        return formatter.format(new Date());
    }
    /**
     * ��õ�ǰ����yyyy-MM-dd HH:mm:ss��ʽ
     * @return
     */
    public static Date getDate()
    {
        return parseToDate(getCurrentDateAsString(), DATETIME_FORMAT_PATTERN);
    }
    
    /**
     * ��Date��ʽ����yyyy-MM-dd HH:mm:ss��ʽ
     * @param d	����
     * @return
     */
    public static String formatToStr(Date d)
    {
    	SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT_PATTERN);
    	return sdf.format(d);
    }
    
    /**
     * ��Date��ʽ����ָ����ʽ
     * @param d			����
     * @param pattern	��ʽ�ַ�
     * @return
     */
    public static String formatToStr(Date d, String pattern)
    {
    	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    	return sdf.format(d);
    }
    
    /**
     * �������ַ�ת��Ϊָ�������ڸ�ʽ
     * 
     * @param str �����ַ�
     * @param pattern ���ڸ�ʽ
     * @return
     */
    public static Date parseToDate(String str, String pattern)
    {
        DateFormat parser = new SimpleDateFormat(pattern);
        try
        {
            return parser.parse(str);
        }
        catch (ParseException e)
        {
            throw new IllegalArgumentException("Can't parse " + str + " using " + pattern);
        }
    }
    /**
     * ��yyyy-MM-dd HH:mm:ss��ʽ�ַ�ת��Date
     * @param str
     * @return
     */
    public static Date parseToDate(String str)
    {
        return parseToDate(str, DATETIME_FORMAT_PATTERN);
    }
    
    /**
     * ��yyyy-MM-dd���� YYYYMMDD ��ʽ�ַ�ת��Date
     * @param str
     * @return
     */
    public static Date parseToDateYMD(String str)
    {
    	if (str.length() == DATEYMD_FORMAT_PATTERN.length())
    		return parseToDate(str, DATEYMD_FORMAT_PATTERN);
    	else
    		return parseToDate(str, DATE_FORMAT_PATTERN);
    }
    
    /**
     * �Ƚ�����ʱ������������
     * @param begin
     * @param end
     * @return
     */
    public static long getDiff(Date begin, Date end)
    {
        long diff = end.getTime() - begin.getTime();
        diff = Math.abs(diff);
        
        //long day = diff / MILLIS_PER_DAY;// ����������
        //long hour = diff % MILLIS_PER_DAY / MILLIS_PER_HOUR;// ��������Сʱ
        //long min = diff % MILLIS_PER_DAY % MILLIS_PER_HOUR / MILLIS_PER_MINUTE;// �������ٷ���
        long sec = diff  / MILLIS_PER_SECOND;// ����������
        
        //System.out.println("ʱ����" + day + "��" + hour + "Сʱ" + min + "����" + sec + "�롣");
        
        return sec;
    }
    
    /**
     * ���ָ�����ڵ�ǰһ��
     * 
     * @param specifiedDay yy-MM-dd
     * @return
     * @throws Exception
     */
    public static String getBeforeDay(String specifiedDay)
    {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try
        {
            date = new SimpleDateFormat(DATE_FORMAT_PATTERN).parse(specifiedDay);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);

        String dayBefore = new SimpleDateFormat(DATE_FORMAT_PATTERN).format(c.getTime());
        return dayBefore;
    }

    /**
     * ���ָ�����ڵĺ�һ��
     * 
     * @param specifiedDay yy-MM-dd
     * @return
     */
    public static String getAfterDay(String specifiedDay)
    {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try
        {
            date = new SimpleDateFormat(DATE_FORMAT_PATTERN).parse(specifiedDay);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + 1);

        String dayAfter = new SimpleDateFormat(DATE_FORMAT_PATTERN).format(c.getTime());
        return dayAfter;
    }
    
    /**
     * ��õ�ǰϵͳ���ڵ���һ��
     * 
     * @return
     */
    public static Date getNextDay()
    {
    	Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date date = calendar.getTime();
		return date;
    }
    
    /**
     * ��õ�ǰϵͳ���ڵ���n��
     * 
     * @return
     */
    public static Date getNextDay(int n)
    {
    	Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, n);
		Date date = calendar.getTime();
		return date;
    }
    /**
     * ���Cron���ʽ��ȡ������������ʱ���Date����
     * @param expression	Cron���ʽ
     * @return
     */
    public static Date parseOnOfflineCronExpression(String expression)
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("ss mm HH * * ?");  
		try 
		{
			return sdf.parse(expression);
		} 
		catch (ParseException e) 
		{
			return null;
		}
    }
    
    /**
     *	��õ�ǰʱ��ǰN���N���ʱ��  ������ǰ  �������
     * @param n	ָ������
     * @param ifWeeHours	�Ƿ���Ҫ��ʱ���붨λ���賿
     * @return
     */
    public static Date getNextOrPrevDay(int n,Boolean ifWeeHours)
    {
    	return getNextOrPrevDay(n,ifWeeHours,new Date());
    }
    
    
    /**
     * ��ȡָ��ʱ���ǰN����ߺ�N�� ������ǰ  �������
     * @param n
     * @param ifWeeHours �Ƿ���Ҫ��ʱ���붨λ���賿
     * @param date		ָ������
     * @return
     */
    public static Date getNextOrPrevDay(int n,Boolean ifWeeHours,Date date)
    {
    	String formatStr = "yyyy-MM-dd HH:mm:ss";
    	if(ifWeeHours)
   	 	{
   	 		formatStr = "yyyy-MM-dd 00:00:00";
   	 	}
   	 	SimpleDateFormat dformat = new SimpleDateFormat(formatStr);
   	 	
   	 	Calendar cd = Calendar.getInstance();
   	 	if(date != null)
   	 	{
   	 		cd.setTime(date);
   	 	}
   	 	cd.add(Calendar.DATE, n);
   	 	return Timestamp.valueOf(dformat.format(cd.getTime()));
    }
    
	/**
	 * ��ȡ��һ������ 
	 * @param tag  0������  1 ������ 2������ 
	 * @return
	 */
	public static Date getFirstDay(int tag) 
	 {
		if(tag < 0 || tag > 2)
		{
			return null;
		}
		 Calendar currentDate = new GregorianCalendar();
		 switch (tag) 
		 {
		 case 0:
			break;
		 case 1:
			 currentDate.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
				break;
		 case 2:
			 currentDate.set(Calendar.DAY_OF_MONTH,1);
				break;
		 default:
			break;
		 }
		 currentDate.set(Calendar.HOUR_OF_DAY, 0);  
		 currentDate.set(Calendar.MINUTE, 0);  
		 currentDate.set(Calendar.SECOND, 0);  
		 return (Date)currentDate.getTime().clone();
	 }
	
	public static Date getNextDay(Date d, int dayOfMonth)
    {
		Calendar cd = Calendar.getInstance();
		cd.setTime(d);
		cd.add(Calendar.DAY_OF_MONTH, dayOfMonth);
		return cd.getTime();
    }
	
	/**
	 * ��ȡ������������յ���ʼʱ��ͽ���ʱ��
	 * ���磬���룺 2015-8-20 15:34:20, 
	 * ����ʼʱ��Ϊ: 2015-8-20 00:00:00
	 *   ����ʱ��Ϊ: 2015-8-20 23:59:59
	 * 
	 * @param d			ʱ��
	 * @param mode		0����ʼ    1������
	 * @return
	 */
	public static Date getDayStartEndTime(Date d, int mode)
	{
		Calendar cd = Calendar.getInstance();
		cd.setTime(d);
		if (mode == 0)
		{
			cd.set(Calendar.HOUR_OF_DAY, 0);
			cd.set(Calendar.MINUTE, 0);
			cd.set(Calendar.SECOND, 0);
			return cd.getTime();
		}
		else
		{
			cd.set(Calendar.HOUR_OF_DAY, 23);
			cd.set(Calendar.MINUTE, 59);
			cd.set(Calendar.SECOND, 59);
			return cd.getTime();
		}
	}
	

	
}
