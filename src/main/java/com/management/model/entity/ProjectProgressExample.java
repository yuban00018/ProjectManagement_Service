package com.management.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectProgressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectProgressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProjectProgressIdIsNull() {
            addCriterion("project_progress_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdIsNotNull() {
            addCriterion("project_progress_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdEqualTo(Integer value) {
            addCriterion("project_progress_id =", value, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdNotEqualTo(Integer value) {
            addCriterion("project_progress_id <>", value, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdGreaterThan(Integer value) {
            addCriterion("project_progress_id >", value, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_progress_id >=", value, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdLessThan(Integer value) {
            addCriterion("project_progress_id <", value, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_progress_id <=", value, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdIn(List<Integer> values) {
            addCriterion("project_progress_id in", values, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdNotIn(List<Integer> values) {
            addCriterion("project_progress_id not in", values, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdBetween(Integer value1, Integer value2) {
            addCriterion("project_progress_id between", value1, value2, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_progress_id not between", value1, value2, "projectProgressId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressIsNull() {
            addCriterion("interim_report_upload_address is null");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressIsNotNull() {
            addCriterion("interim_report_upload_address is not null");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressEqualTo(String value) {
            addCriterion("interim_report_upload_address =", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressNotEqualTo(String value) {
            addCriterion("interim_report_upload_address <>", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressGreaterThan(String value) {
            addCriterion("interim_report_upload_address >", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressGreaterThanOrEqualTo(String value) {
            addCriterion("interim_report_upload_address >=", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressLessThan(String value) {
            addCriterion("interim_report_upload_address <", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressLessThanOrEqualTo(String value) {
            addCriterion("interim_report_upload_address <=", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressLike(String value) {
            addCriterion("interim_report_upload_address like", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressNotLike(String value) {
            addCriterion("interim_report_upload_address not like", value, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressIn(List<String> values) {
            addCriterion("interim_report_upload_address in", values, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressNotIn(List<String> values) {
            addCriterion("interim_report_upload_address not in", values, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressBetween(String value1, String value2) {
            addCriterion("interim_report_upload_address between", value1, value2, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportUploadAddressNotBetween(String value1, String value2) {
            addCriterion("interim_report_upload_address not between", value1, value2, "interimReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeIsNull() {
            addCriterion("interim_report_time is null");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeIsNotNull() {
            addCriterion("interim_report_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeEqualTo(Date value) {
            addCriterion("interim_report_time =", value, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeNotEqualTo(Date value) {
            addCriterion("interim_report_time <>", value, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeGreaterThan(Date value) {
            addCriterion("interim_report_time >", value, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interim_report_time >=", value, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeLessThan(Date value) {
            addCriterion("interim_report_time <", value, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("interim_report_time <=", value, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeIn(List<Date> values) {
            addCriterion("interim_report_time in", values, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeNotIn(List<Date> values) {
            addCriterion("interim_report_time not in", values, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeBetween(Date value1, Date value2) {
            addCriterion("interim_report_time between", value1, value2, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andInterimReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("interim_report_time not between", value1, value2, "interimReportTime");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportIsNull() {
            addCriterion("is_finished_interim_report is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportIsNotNull() {
            addCriterion("is_finished_interim_report is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportEqualTo(Integer value) {
            addCriterion("is_finished_interim_report =", value, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportNotEqualTo(Integer value) {
            addCriterion("is_finished_interim_report <>", value, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportGreaterThan(Integer value) {
            addCriterion("is_finished_interim_report >", value, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_finished_interim_report >=", value, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportLessThan(Integer value) {
            addCriterion("is_finished_interim_report <", value, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportLessThanOrEqualTo(Integer value) {
            addCriterion("is_finished_interim_report <=", value, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportIn(List<Integer> values) {
            addCriterion("is_finished_interim_report in", values, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportNotIn(List<Integer> values) {
            addCriterion("is_finished_interim_report not in", values, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportBetween(Integer value1, Integer value2) {
            addCriterion("is_finished_interim_report between", value1, value2, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedInterimReportNotBetween(Integer value1, Integer value2) {
            addCriterion("is_finished_interim_report not between", value1, value2, "isFinishedInterimReport");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonIsNull() {
            addCriterion("interim_report_failure_reason is null");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonIsNotNull() {
            addCriterion("interim_report_failure_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonEqualTo(String value) {
            addCriterion("interim_report_failure_reason =", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonNotEqualTo(String value) {
            addCriterion("interim_report_failure_reason <>", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonGreaterThan(String value) {
            addCriterion("interim_report_failure_reason >", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonGreaterThanOrEqualTo(String value) {
            addCriterion("interim_report_failure_reason >=", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonLessThan(String value) {
            addCriterion("interim_report_failure_reason <", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonLessThanOrEqualTo(String value) {
            addCriterion("interim_report_failure_reason <=", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonLike(String value) {
            addCriterion("interim_report_failure_reason like", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonNotLike(String value) {
            addCriterion("interim_report_failure_reason not like", value, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonIn(List<String> values) {
            addCriterion("interim_report_failure_reason in", values, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonNotIn(List<String> values) {
            addCriterion("interim_report_failure_reason not in", values, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonBetween(String value1, String value2) {
            addCriterion("interim_report_failure_reason between", value1, value2, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andInterimReportFailureReasonNotBetween(String value1, String value2) {
            addCriterion("interim_report_failure_reason not between", value1, value2, "interimReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressIsNull() {
            addCriterion("concluding_report_upload_address is null");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressIsNotNull() {
            addCriterion("concluding_report_upload_address is not null");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressEqualTo(String value) {
            addCriterion("concluding_report_upload_address =", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressNotEqualTo(String value) {
            addCriterion("concluding_report_upload_address <>", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressGreaterThan(String value) {
            addCriterion("concluding_report_upload_address >", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressGreaterThanOrEqualTo(String value) {
            addCriterion("concluding_report_upload_address >=", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressLessThan(String value) {
            addCriterion("concluding_report_upload_address <", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressLessThanOrEqualTo(String value) {
            addCriterion("concluding_report_upload_address <=", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressLike(String value) {
            addCriterion("concluding_report_upload_address like", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressNotLike(String value) {
            addCriterion("concluding_report_upload_address not like", value, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressIn(List<String> values) {
            addCriterion("concluding_report_upload_address in", values, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressNotIn(List<String> values) {
            addCriterion("concluding_report_upload_address not in", values, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressBetween(String value1, String value2) {
            addCriterion("concluding_report_upload_address between", value1, value2, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportUploadAddressNotBetween(String value1, String value2) {
            addCriterion("concluding_report_upload_address not between", value1, value2, "concludingReportUploadAddress");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeIsNull() {
            addCriterion("concluding_report_time is null");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeIsNotNull() {
            addCriterion("concluding_report_time is not null");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeEqualTo(Date value) {
            addCriterion("concluding_report_time =", value, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeNotEqualTo(Date value) {
            addCriterion("concluding_report_time <>", value, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeGreaterThan(Date value) {
            addCriterion("concluding_report_time >", value, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("concluding_report_time >=", value, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeLessThan(Date value) {
            addCriterion("concluding_report_time <", value, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("concluding_report_time <=", value, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeIn(List<Date> values) {
            addCriterion("concluding_report_time in", values, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeNotIn(List<Date> values) {
            addCriterion("concluding_report_time not in", values, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeBetween(Date value1, Date value2) {
            addCriterion("concluding_report_time between", value1, value2, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andConcludingReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("concluding_report_time not between", value1, value2, "concludingReportTime");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportIsNull() {
            addCriterion("is_finished_concluding_report is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportIsNotNull() {
            addCriterion("is_finished_concluding_report is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportEqualTo(Integer value) {
            addCriterion("is_finished_concluding_report =", value, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportNotEqualTo(Integer value) {
            addCriterion("is_finished_concluding_report <>", value, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportGreaterThan(Integer value) {
            addCriterion("is_finished_concluding_report >", value, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_finished_concluding_report >=", value, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportLessThan(Integer value) {
            addCriterion("is_finished_concluding_report <", value, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportLessThanOrEqualTo(Integer value) {
            addCriterion("is_finished_concluding_report <=", value, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportIn(List<Integer> values) {
            addCriterion("is_finished_concluding_report in", values, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportNotIn(List<Integer> values) {
            addCriterion("is_finished_concluding_report not in", values, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportBetween(Integer value1, Integer value2) {
            addCriterion("is_finished_concluding_report between", value1, value2, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andIsFinishedConcludingReportNotBetween(Integer value1, Integer value2) {
            addCriterion("is_finished_concluding_report not between", value1, value2, "isFinishedConcludingReport");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonIsNull() {
            addCriterion("concluding_report_failure_reason is null");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonIsNotNull() {
            addCriterion("concluding_report_failure_reason is not null");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonEqualTo(String value) {
            addCriterion("concluding_report_failure_reason =", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonNotEqualTo(String value) {
            addCriterion("concluding_report_failure_reason <>", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonGreaterThan(String value) {
            addCriterion("concluding_report_failure_reason >", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonGreaterThanOrEqualTo(String value) {
            addCriterion("concluding_report_failure_reason >=", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonLessThan(String value) {
            addCriterion("concluding_report_failure_reason <", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonLessThanOrEqualTo(String value) {
            addCriterion("concluding_report_failure_reason <=", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonLike(String value) {
            addCriterion("concluding_report_failure_reason like", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonNotLike(String value) {
            addCriterion("concluding_report_failure_reason not like", value, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonIn(List<String> values) {
            addCriterion("concluding_report_failure_reason in", values, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonNotIn(List<String> values) {
            addCriterion("concluding_report_failure_reason not in", values, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonBetween(String value1, String value2) {
            addCriterion("concluding_report_failure_reason between", value1, value2, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andConcludingReportFailureReasonNotBetween(String value1, String value2) {
            addCriterion("concluding_report_failure_reason not between", value1, value2, "concludingReportFailureReason");
            return (Criteria) this;
        }

        public Criteria andProjectProcessIsNull() {
            addCriterion("project_process is null");
            return (Criteria) this;
        }

        public Criteria andProjectProcessIsNotNull() {
            addCriterion("project_process is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProcessEqualTo(Integer value) {
            addCriterion("project_process =", value, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessNotEqualTo(Integer value) {
            addCriterion("project_process <>", value, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessGreaterThan(Integer value) {
            addCriterion("project_process >", value, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_process >=", value, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessLessThan(Integer value) {
            addCriterion("project_process <", value, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessLessThanOrEqualTo(Integer value) {
            addCriterion("project_process <=", value, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessIn(List<Integer> values) {
            addCriterion("project_process in", values, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessNotIn(List<Integer> values) {
            addCriterion("project_process not in", values, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessBetween(Integer value1, Integer value2) {
            addCriterion("project_process between", value1, value2, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectProcessNotBetween(Integer value1, Integer value2) {
            addCriterion("project_process not between", value1, value2, "projectProcess");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdIsNull() {
            addCriterion("project_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdIsNotNull() {
            addCriterion("project_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdEqualTo(Integer value) {
            addCriterion("project_category_id =", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdNotEqualTo(Integer value) {
            addCriterion("project_category_id <>", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdGreaterThan(Integer value) {
            addCriterion("project_category_id >", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_category_id >=", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdLessThan(Integer value) {
            addCriterion("project_category_id <", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_category_id <=", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdIn(List<Integer> values) {
            addCriterion("project_category_id in", values, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdNotIn(List<Integer> values) {
            addCriterion("project_category_id not in", values, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("project_category_id between", value1, value2, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_category_id not between", value1, value2, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andUploadAddressIsNull() {
            addCriterion("upload_address is null");
            return (Criteria) this;
        }

        public Criteria andUploadAddressIsNotNull() {
            addCriterion("upload_address is not null");
            return (Criteria) this;
        }

        public Criteria andUploadAddressEqualTo(String value) {
            addCriterion("upload_address =", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressNotEqualTo(String value) {
            addCriterion("upload_address <>", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressGreaterThan(String value) {
            addCriterion("upload_address >", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressGreaterThanOrEqualTo(String value) {
            addCriterion("upload_address >=", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressLessThan(String value) {
            addCriterion("upload_address <", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressLessThanOrEqualTo(String value) {
            addCriterion("upload_address <=", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressLike(String value) {
            addCriterion("upload_address like", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressNotLike(String value) {
            addCriterion("upload_address not like", value, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressIn(List<String> values) {
            addCriterion("upload_address in", values, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressNotIn(List<String> values) {
            addCriterion("upload_address not in", values, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressBetween(String value1, String value2) {
            addCriterion("upload_address between", value1, value2, "uploadAddress");
            return (Criteria) this;
        }

        public Criteria andUploadAddressNotBetween(String value1, String value2) {
            addCriterion("upload_address not between", value1, value2, "uploadAddress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}