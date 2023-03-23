# 外部环境要做的

* mysql数据库建立查询

```sql
create database springbootdata;
use springbootdata;
drop table if exists `t_article`;
create table `t_article` (
    `id` int(20) not null auto_increment comment '文章id',
    `title` varchar(200) default null comment '文章标题',
    `content` longtext comment '文章内容',
    primary key (`id`)
) engine=InnoDB auto_increment=2 default charset=utf8;
insert into `t_article` values ('1','Spring Boot 基础入门','从入门到精通讲解...');
insert into `t_article` values ('2','Spring Cloud基础入门','从入门到精通讲解...');
drop table if exists `t_comment`;
create table `t_comment` (
    `id` int(20) not null auto_Increment comment '评论id',
    `content` longtext comment '评论内容',
    `author` varchar(200) default null comment '评论作者',
    `a_id` int(20) default null comment '关联的文章id',
    primary key (`id`)
) engine=InnoDB auto_increment=3 default charset=utf8;
insert into `t_comment` values ('1','123','tom1','1');
insert into `t_comment` values ('2','123','tom2','1');
insert into `t_comment` values ('3','123','tom3','1');
insert into `t_comment` values ('4','123','tom4','1');
insert into `t_comment` values ('5','123','tom5','2');

```

* redis安装（键值对数据库）

* 
