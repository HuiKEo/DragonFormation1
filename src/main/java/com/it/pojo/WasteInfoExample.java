package com.it.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WasteInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WasteInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIsNull() {
            addCriterion("batch_code is null");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIsNotNull() {
            addCriterion("batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBatchCodeEqualTo(String value) {
            addCriterion("batch_code =", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotEqualTo(String value) {
            addCriterion("batch_code <>", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeGreaterThan(String value) {
            addCriterion("batch_code >", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("batch_code >=", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLessThan(String value) {
            addCriterion("batch_code <", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("batch_code <=", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLike(String value) {
            addCriterion("batch_code like", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotLike(String value) {
            addCriterion("batch_code not like", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIn(List<String> values) {
            addCriterion("batch_code in", values, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotIn(List<String> values) {
            addCriterion("batch_code not in", values, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeBetween(String value1, String value2) {
            addCriterion("batch_code between", value1, value2, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotBetween(String value1, String value2) {
            addCriterion("batch_code not between", value1, value2, "batchCode");
            return (Criteria) this;
        }

        public Criteria andWasteNameIsNull() {
            addCriterion("waste_name is null");
            return (Criteria) this;
        }

        public Criteria andWasteNameIsNotNull() {
            addCriterion("waste_name is not null");
            return (Criteria) this;
        }

        public Criteria andWasteNameEqualTo(String value) {
            addCriterion("waste_name =", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotEqualTo(String value) {
            addCriterion("waste_name <>", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameGreaterThan(String value) {
            addCriterion("waste_name >", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameGreaterThanOrEqualTo(String value) {
            addCriterion("waste_name >=", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameLessThan(String value) {
            addCriterion("waste_name <", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameLessThanOrEqualTo(String value) {
            addCriterion("waste_name <=", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameLike(String value) {
            addCriterion("waste_name like", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotLike(String value) {
            addCriterion("waste_name not like", value, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameIn(List<String> values) {
            addCriterion("waste_name in", values, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotIn(List<String> values) {
            addCriterion("waste_name not in", values, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameBetween(String value1, String value2) {
            addCriterion("waste_name between", value1, value2, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteNameNotBetween(String value1, String value2) {
            addCriterion("waste_name not between", value1, value2, "wasteName");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryIsNull() {
            addCriterion("waste_category is null");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryIsNotNull() {
            addCriterion("waste_category is not null");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryEqualTo(Integer value) {
            addCriterion("waste_category =", value, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryNotEqualTo(Integer value) {
            addCriterion("waste_category <>", value, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryGreaterThan(Integer value) {
            addCriterion("waste_category >", value, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("waste_category >=", value, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryLessThan(Integer value) {
            addCriterion("waste_category <", value, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("waste_category <=", value, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryIn(List<Integer> values) {
            addCriterion("waste_category in", values, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryNotIn(List<Integer> values) {
            addCriterion("waste_category not in", values, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryBetween(Integer value1, Integer value2) {
            addCriterion("waste_category between", value1, value2, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andWasteCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("waste_category not between", value1, value2, "wasteCategory");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNull() {
            addCriterion("measure is null");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNotNull() {
            addCriterion("measure is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureEqualTo(String value) {
            addCriterion("measure =", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotEqualTo(String value) {
            addCriterion("measure <>", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThan(String value) {
            addCriterion("measure >", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("measure >=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThan(String value) {
            addCriterion("measure <", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThanOrEqualTo(String value) {
            addCriterion("measure <=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLike(String value) {
            addCriterion("measure like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotLike(String value) {
            addCriterion("measure not like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureIn(List<String> values) {
            addCriterion("measure in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotIn(List<String> values) {
            addCriterion("measure not in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureBetween(String value1, String value2) {
            addCriterion("measure between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotBetween(String value1, String value2) {
            addCriterion("measure not between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseIsNull() {
            addCriterion("source_enterprise is null");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseIsNotNull() {
            addCriterion("source_enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseEqualTo(String value) {
            addCriterion("source_enterprise =", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseNotEqualTo(String value) {
            addCriterion("source_enterprise <>", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseGreaterThan(String value) {
            addCriterion("source_enterprise >", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("source_enterprise >=", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseLessThan(String value) {
            addCriterion("source_enterprise <", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("source_enterprise <=", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseLike(String value) {
            addCriterion("source_enterprise like", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseNotLike(String value) {
            addCriterion("source_enterprise not like", value, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseIn(List<String> values) {
            addCriterion("source_enterprise in", values, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseNotIn(List<String> values) {
            addCriterion("source_enterprise not in", values, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseBetween(String value1, String value2) {
            addCriterion("source_enterprise between", value1, value2, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceEnterpriseNotBetween(String value1, String value2) {
            addCriterion("source_enterprise not between", value1, value2, "sourceEnterprise");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopIsNull() {
            addCriterion("source_workshop is null");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopIsNotNull() {
            addCriterion("source_workshop is not null");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopEqualTo(String value) {
            addCriterion("source_workshop =", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopNotEqualTo(String value) {
            addCriterion("source_workshop <>", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopGreaterThan(String value) {
            addCriterion("source_workshop >", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopGreaterThanOrEqualTo(String value) {
            addCriterion("source_workshop >=", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopLessThan(String value) {
            addCriterion("source_workshop <", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopLessThanOrEqualTo(String value) {
            addCriterion("source_workshop <=", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopLike(String value) {
            addCriterion("source_workshop like", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopNotLike(String value) {
            addCriterion("source_workshop not like", value, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopIn(List<String> values) {
            addCriterion("source_workshop in", values, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopNotIn(List<String> values) {
            addCriterion("source_workshop not in", values, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopBetween(String value1, String value2) {
            addCriterion("source_workshop between", value1, value2, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceWorkshopNotBetween(String value1, String value2) {
            addCriterion("source_workshop not between", value1, value2, "sourceWorkshop");
            return (Criteria) this;
        }

        public Criteria andSourceMachineIsNull() {
            addCriterion("source_machine is null");
            return (Criteria) this;
        }

        public Criteria andSourceMachineIsNotNull() {
            addCriterion("source_machine is not null");
            return (Criteria) this;
        }

        public Criteria andSourceMachineEqualTo(String value) {
            addCriterion("source_machine =", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineNotEqualTo(String value) {
            addCriterion("source_machine <>", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineGreaterThan(String value) {
            addCriterion("source_machine >", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineGreaterThanOrEqualTo(String value) {
            addCriterion("source_machine >=", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineLessThan(String value) {
            addCriterion("source_machine <", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineLessThanOrEqualTo(String value) {
            addCriterion("source_machine <=", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineLike(String value) {
            addCriterion("source_machine like", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineNotLike(String value) {
            addCriterion("source_machine not like", value, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineIn(List<String> values) {
            addCriterion("source_machine in", values, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineNotIn(List<String> values) {
            addCriterion("source_machine not in", values, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineBetween(String value1, String value2) {
            addCriterion("source_machine between", value1, value2, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andSourceMachineNotBetween(String value1, String value2) {
            addCriterion("source_machine not between", value1, value2, "sourceMachine");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isdeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Integer value) {
            addCriterion("isdeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Integer value) {
            addCriterion("isdeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Integer value) {
            addCriterion("isdeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Integer value) {
            addCriterion("isdeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("isdeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Integer> values) {
            addCriterion("isdeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Integer> values) {
            addCriterion("isdeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("isdeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("isdeleted not between", value1, value2, "isdeleted");
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