/*==============================================================*/
/* DBMS name:      MySQL 5.1                                    */
/* Created on:     2016/10/20 星期四 15:52:52                      */
/*==============================================================*/

DROP TABLE IF EXISTS tbug;

DROP TABLE IF EXISTS tmenu;

DROP TABLE IF EXISTS tonline;

DROP TABLE IF EXISTS tresource;

DROP TABLE IF EXISTS trole;

DROP TABLE IF EXISTS trole_tresource;

DROP TABLE IF EXISTS tuser;

DROP TABLE IF EXISTS tuser_trole;

DROP TABLE IF EXISTS t_instmt_quartz;

DROP TABLE IF EXISTS wd_buyer;

DROP TABLE IF EXISTS wd_companyinfo;

DROP TABLE IF EXISTS wd_custinfo;

DROP TABLE IF EXISTS wd_dictdata;

DROP TABLE IF EXISTS wd_dicttype;

DROP TABLE IF EXISTS wd_imgfile;

DROP TABLE IF EXISTS wd_logsinfo;

DROP TABLE IF EXISTS wd_projectinfo;

DROP TABLE IF EXISTS wd_serviceinfo;



/*========创建表开始======================================================*/

-- 创建tbug表
CREATE TABLE tbug
(
  id VARCHAR(100) PRIMARY KEY ,
  CREATEDATETIME DATETIME,
  NAME VARCHAR(50),
  note VARCHAR(1000)
);

-- 创建tmenu表
CREATE TABLE tmenu
(
  id VARCHAR(100) PRIMARY KEY ,
  iconcls VARCHAR(200),
  seq DECIMAL(10,2),
  TEXT VARCHAR(2000),
  url VARCHAR(2000),
  pid VARCHAR(100)
);

-- 创建tonline表
CREATE TABLE tonline
(
  id VARCHAR(100) PRIMARY KEY ,
  ip VARCHAR(100),
  logindatetime DATETIME,
  loginname VARCHAR(100)
);

-- 创建表
CREATE TABLE tresource
(
  id VARCHAR(100) PRIMARY KEY ,
  seq DECIMAL(10,2),
  TEXT VARCHAR(2000),
  url VARCHAR(1000),
  pid VARCHAR(100)
);

-- 创建trole表
CREATE TABLE trole
(
   id VARCHAR(100) PRIMARY KEY ,
   TEXT VARCHAR(2000)
);

-- 创建trole_tresource表
CREATE TABLE trole_tresource
(
  id VARCHAR(100) PRIMARY KEY ,
  RESOURCE_ID VARCHAR(100),
  ROLE_ID VARCHAR(100)
);

-- 创建tuser表
CREATE TABLE tuser
(
  id VARCHAR(100) PRIMARY KEY ,
  createdatetime DATETIME,
  modifydatetime DATETIME,
  NAME VARCHAR(100),
  pwd VARCHAR(500),
  CREATE_TIME DATETIME,
  UPDATE_TIME DATETIME
);

-- 创建tuser_trole表
CREATE TABLE tuser_trole
(
  id VARCHAR(100) PRIMARY KEY ,
  ROLE_ID VARCHAR(100),
  USER_ID VARCHAR(100)
);


-- 定时任务设计表
CREATE TABLE t_instmt_quartz
(
	id VARCHAR(100) PRIMARY KEY ,
	job_group VARCHAR(256) COMMENT '任务组',
	trigger_group VARCHAR(256) COMMENT '触发器组',  
	job_name VARCHAR(128) COMMENT '任务名', 
	trigger_name VARCHAR(128) COMMENT '触发器名',   
	class_name VARCHAR(128) COMMENT '执行代码的类名', 
	enable_status VARCHAR(2) DEFAULT '1' COMMENT '是否禁用:0禁用;1启用',
	trigger_cron VARCHAR(128) COMMENT '触发器类型(时间) */5 * * * * ?',
	trigger_status VARCHAR(2) COMMENT '任务状态:0关闭;1运行中;2暂停;',
	crate_time DATETIME COMMENT '创建时间',
	update_time DATETIME COMMENT '更新时间',
	desc_ript VARCHAR(1024) COMMENT '描述'
);


/*==============================================================*/
/* Table: wd_buyer   用户登录验证表                                           */
/*==============================================================*/
CREATE TABLE wd_buyer
(
   id                   VARCHAR(100) PRIMARY KEY,
   first_name           VARCHAR(200),
   mobile               VARCHAR(11),
   PASSWORD             VARCHAR(500) COMMENT '密码初次添加的时候是发送随机的8位数字，并通过MD5加密保存',
   create_time          DATETIME,
   email                VARCHAR(100) COMMENT '邮箱必填，并通过数据字典加载后面的@qq.com、@163.com等等',
   STATUS               VARCHAR(2) COMMENT '状态：0表示禁止登录；1表示正常'
);

ALTER TABLE wd_buyer COMMENT '用户登录验证表';

/*==============================================================*/
/* Table: wd_custinfo      用户详细信息表                                     */
/*==============================================================*/
CREATE TABLE wd_custinfo
(
   id                   VARCHAR(100) PRIMARY KEY,
   buyer_code           VARCHAR(100) COMMENT '此字段是登录验证表的id',
   NAME                 VARCHAR(200) COMMENT '用户姓名',
   create_time          DATETIME,
   update_time          DATETIME,
   address              VARCHAR(1000) COMMENT '个人家庭地址，可为空',
   img_code             VARCHAR(100) COMMENT '此字段为图片附件表的id，用来存放用户的头像图片。可以为空',
   company_mobile       VARCHAR(11) COMMENT '公司里面的固话座机、或者手机。可以为空',
   company_code         VARCHAR(100) COMMENT '公司id表示这个人属于哪个公司',
   POSITION             VARCHAR(1000) COMMENT '说明这个用户在公司的职位名称',
   introduct            VARCHAR(2000) COMMENT '这个人的在公司的简介'
);

ALTER TABLE wd_custinfo COMMENT '用户详细信息表';

/*==============================================================*/
/* Table: wd_companyinfo    公司信息表                                    */
/*==============================================================*/
CREATE TABLE wd_companyinfo
(
   id                   VARCHAR(100) PRIMARY KEY,
   company_unique       VARCHAR(20) COMMENT '公司唯一识别码：在创建公司信息的时候给定',
   cust_code            VARCHAR(100),
   cust_name            VARCHAR(200),
   create_time          DATETIME,
   update_time          DATETIME,
   company_mobile       VARCHAR(20),
   company_adress       VARCHAR(1000),
   company_email        VARCHAR(100),
   com_custcodes        VARCHAR(3000) COMMENT '公司负责人id拼接，主要用来介绍',
   spare_one            VARCHAR(500),
   spare_two            VARCHAR(500)
);

ALTER TABLE wd_companyinfo COMMENT '公司信息表';

/*==============================================================*/
/* Table: wd_dicttype    数据字典表，作为字典主表                                       */
/*==============================================================*/
CREATE TABLE wd_dicttype
(
   id                   VARCHAR(100) PRIMARY KEY,
   dict_type_cd         VARCHAR(100) COMMENT '字典代码作为某个数据字段的唯一读取标示，不能重复',
   dict_type_name       VARCHAR(500),
   remark               VARCHAR(1000),
   create_time          DATETIME,
   update_time          DATETIME,
   cust_code            VARCHAR(100),
   cust_name            VARCHAR(200)
);

ALTER TABLE wd_dicttype COMMENT '数据字典表，作为字典主表';


/*==============================================================*/
/* Table: wd_dictdata    数据字典详细表，数据字典从表                                       */
/*==============================================================*/
CREATE TABLE wd_dictdata
(
   id                   VARCHAR(100) PRIMARY KEY,
   dict_cd              VARCHAR(200) COMMENT '代码是详细字典的唯一标示，不能重复',
   dict_name            VARCHAR(500),
   dict_order_no        VARCHAR(100) COMMENT '序号可以用来检索的顺序',
   remark               VARCHAR(1000),
   dict_type_code       VARCHAR(1000) COMMENT '数据字典主键id',
   create_time          DATETIME,
   update_time          DATETIME
);

ALTER TABLE wd_dictdata COMMENT '数据字典详细表，数据字典从表';

/*==============================================================*/
/* Table: wd_imgfile       图片附件表                                     */
/*==============================================================*/
CREATE TABLE wd_imgfile
(
   id                   VARCHAR(100) PRIMARY KEY,
   img_path             VARCHAR(2000) COMMENT '图片路径，此处我们可以把图片上传到ftp服务器，只要返回文件夹图片名当做路径就OK了',
   img_type             VARCHAR(2) COMMENT '图片类型从数据字典里取出来，再保存到这里',
   create_time          DATETIME,
   update_time          DATETIME,
   cust_code            VARCHAR(100) COMMENT '上传人的id',
   cust_name            VARCHAR(200) COMMENT '上传人的姓名',
   desc_ribe            VARCHAR(1000) COMMENT '是对图片的描述，可为空'
);

ALTER TABLE wd_imgfile COMMENT '图片附件表';

/*==============================================================*/
/* Table: wd_logsinfo       系统日志表                                    */
/*==============================================================*/
CREATE TABLE wd_logsinfo
(
   id                   VARCHAR(100) PRIMARY KEY,
   cust_code            VARCHAR(100),
   cust_name            VARCHAR(200),
   create_time          DATETIME,
   optype               VARCHAR(2) COMMENT '操作类型：L新增、U更改、D删除、C查询',
   contect              VARCHAR(1000)
);

ALTER TABLE wd_logsinfo COMMENT '系统日志表';

/*==============================================================*/
/* Table: wd_projectinfo      项目案例表                                  */
/*==============================================================*/
CREATE TABLE wd_projectinfo
(
   id                   VARCHAR(100) PRIMARY KEY,
   title                VARCHAR(500),
   contect              VARCHAR(5000),
   first_imgcode        VARCHAR(100) COMMENT '项目案例默认展现出来的第一张图片code',
   img_codes            VARCHAR(3000) COMMENT '项目案例中多张图片code的拼接，以英文状态的逗号拼接',
   cust_code            VARCHAR(100),
   cust_name            VARCHAR(200),
   create_time          DATETIME,
   update_time          DATETIME
);

ALTER TABLE wd_projectinfo COMMENT '项目案例表';

/*==============================================================*/
/* Table: wd_serviceinfo      服务信息表                                  */
/*==============================================================*/
CREATE TABLE wd_serviceinfo
(
   id                   VARCHAR(100) PRIMARY KEY,
   tiltle               VARCHAR(500),
   contect              VARCHAR(2000),
   service_type         VARCHAR(100) COMMENT '服务类型也从数据字典里取出来，此处只是存入类型值，到时用类型值去字典里找到详细的信息',
   first_img_code       VARCHAR(100) COMMENT '默认要展示一张图片出来，所以此处显示出第一张图片',
   img_codes            VARCHAR(5000) COMMENT '因为服务的介绍都会有多张图片，所以此处用code拼接',
   cust_code            VARCHAR(100) COMMENT '上传人的code',
   cust_name            VARCHAR(200) COMMENT '创建人的姓名',
   create_time          DATETIME,
   update_time          DATETIME
);

ALTER TABLE wd_serviceinfo COMMENT '服务信息表';

/*========创建表结束======================================================*/



-- 定时任务
SELECT * FROM t_instmt_quartz tiqz;





