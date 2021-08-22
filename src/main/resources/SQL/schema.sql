
CREATE TABLE IF NOT EXISTS jobs
(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	jobname VARCHAR(50) UNIQUE NOT NULL,
	jobstatus VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);

INSERT INTO jobs (jobname, jobstatus)
VALUES
		("Methodist Specialty & Transplant Hospital","New"),
		("Methodist Ambulatory Surgery Hospital NW","In-Progress"),
		("Foundation Surgical Hospital of S.A.","Done"),
		("Clover Health, LLC","Done"),
		("University Health","In-Progress"),
		("St. Lukes Baptist Hospital","Done"),
		("North Central Baptist Hospital","Done"),
		("Methodist Childrens Hospital of South Texas","New"),
		("Methodist Ambulatory Surgery Center-Central","In-Progress"),
		("CHRISTUS Santa Rosa Health System","In-Progress"),
		("Laurel Ridge Treatment Center","New"),
		("Baptist Health System","In-Progress");


