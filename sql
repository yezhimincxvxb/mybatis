CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `real_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '真实姓名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
  `gender` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '1' COMMENT '性别[0-女，1-男]',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '备注',
  `state` tinyint(1) DEFAULT '1' COMMENT '状态[0-冻结，1-正常]',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '删除状态[0-未删除，1-已删除]',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `create_date_unix` varchar(50) DEFAULT '' COMMENT '创建时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

insert into user values
(1,"佟湘玉","闫妮","tongxiangyu",0,"同福客栈掌柜、龙门镖局大小姐、衡山派掌门的遗孀",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.','')),
(2,"白展堂","沙溢","baizhantang",1,"本名白玉汤，跑堂、隐退的盗圣",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.','')),
(3,"莫小贝","王莎莎","moxiaobei",0,"佟湘玉的小姑子、衡山掌门的妹妹、五岳盟主",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.','')),
(4,"吕轻侯","喻恩泰","lvqinghou",1,"账房、前朝吕知府的孙子、关中大侠，爱称吕秀才",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.','')),
(5,"郭芙蓉","姚晨","guofurong",0,"打杂、郭巨侠之女",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.','')),
(6,"李秀莲","姜超","lixiulian",1,"诨名李大嘴，厨子、七侠镇娄知县的内侄",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.','')),
(7,"邢育森(老邢)","范明","laoxing",1,"七侠镇捕头、十八里铺捕头",1,0,now(),now(),REPLACE(unix_timestamp(current_timestamp(3)),'.',''));

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT 'user表的id',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账户名',
  `pay_password` varchar(20) DEFAULT NULL COMMENT '支付密码',
  `total_money` double(20,2) DEFAULT NULL COMMENT '总资金',
  `available_money` double(20,2) DEFAULT NULL COMMENT '可用资金',
  `frozen_money` double(20,2) DEFAULT NULL COMMENT '冻结资金',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='账号资金表';

CREATE DEFINER=`root`@`localhost` TRIGGER `money_change` BEFORE UPDATE ON `account` FOR EACH ROW BEGIN
	 SET new.total_money = (new.available_money + new.frozen_money);
END;

insert into account values
(1,1,"佟湘玉","tongxiangyu",100000,0,100000,now(),now()),
(2,2,"白展堂","baizhantang",6000,0,6000,now(),now()),
(3,3,"莫小贝","moxiaobei",0,0,500,now(),now()),
(4,4,"吕轻侯","lvqinghou",9000,0,9000,now(),now()),
(5,5,"郭芙蓉","guofurong",2000,0,2000,now(),now()),
(6,6,"李秀莲","lixiulian",4000,0,4000,now(),now()),
(7,7,"邢育森(老邢)","laoxing",0,0,8000,now(),now());