CREATE TABLE credit_card (
  card_id bigint not null AUTO_INCREMENT comment '信用卡id',
  card_no BIGINT comment '卡号',
  Attribution_bank VARCHAR(12) comment '归属银行',
  Attribution VARCHAR(12) comment '归属人',
  bill_date TINYINT comment '账单日',
  Repayment_date TINYINT comment '还款日',
  Current_bill_date DATE  comment '本期账单日',
  Current_Repayment_date DATE  comment '本期还款日',
  Current_bill DECIMAL(6,2) comment '本期账单金额',
  available_amount DECIMAL comment '当前可用金额',
  Total_amount DECIMAL comment '总额度',
  PRIMARY KEY (card_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '信用卡信息';

INSERT INTO
 credit_card (
 card_no, Attribution_bank, Attribution, bill_date, Repayment_date,
  Current_bill_date, Current_Repayment_date, Current_bill, available_amount, Total_amount
 )
 VALUES
 (NULL ,'招商银行',NULL ,3,23,NULL ,NULL ,NULL ,334.57,24000.00),
(NULL ,'中信银行',NULL ,3,23,NULL ,NULL ,NULL ,334.57,24000.00),
(NULL ,'交通银行',NULL ,3,23,NULL ,NULL ,NULL ,334.57,24000.00),
(NULL ,'广发银行',NULL ,3,23,NULL ,NULL ,NULL ,334.57,24000.00);

INSERT  INTO
  score (
  cr_id,st_id,score
  ) VALUES
  (11,1,100),
  (11,2,100),
  (11,3,100),
  (12,1,100),
  (12,2,100),
  (12,3,100),
  (13,1,100),
  (13,2,100),
  (13,3,100)
-- MySQL大数据量分页性能优化
SELECT * FROM product a JOIN (select id from product limit 866613, 20) b ON a.ID = b.id
-- 简单触发器示例
CREATE TRIGGER lasttime
AFTER UPDATE ON myaccount.credit_card
FOR EACH ROW
BEGIN
UPDATE seckill SET a=1 WHERE id = new/old.id ;
END;

