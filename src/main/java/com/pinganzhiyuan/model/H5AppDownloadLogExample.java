package com.pinganzhiyuan.model;

import java.util.ArrayList;
import java.util.List;

public class H5AppDownloadLogExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public H5AppDownloadLogExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
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

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andIpIsNull() {
			addCriterion("ip is null");
			return (Criteria) this;
		}

		public Criteria andIpIsNotNull() {
			addCriterion("ip is not null");
			return (Criteria) this;
		}

		public Criteria andIpEqualTo(String value) {
			addCriterion("ip =", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotEqualTo(String value) {
			addCriterion("ip <>", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThan(String value) {
			addCriterion("ip >", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpGreaterThanOrEqualTo(String value) {
			addCriterion("ip >=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThan(String value) {
			addCriterion("ip <", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLessThanOrEqualTo(String value) {
			addCriterion("ip <=", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpLike(String value) {
			addCriterion("ip like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotLike(String value) {
			addCriterion("ip not like", value, "ip");
			return (Criteria) this;
		}

		public Criteria andIpIn(List<String> values) {
			addCriterion("ip in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotIn(List<String> values) {
			addCriterion("ip not in", values, "ip");
			return (Criteria) this;
		}

		public Criteria andIpBetween(String value1, String value2) {
			addCriterion("ip between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andIpNotBetween(String value1, String value2) {
			addCriterion("ip not between", value1, value2, "ip");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdIsNull() {
			addCriterion("h5_client_version_id is null");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdIsNotNull() {
			addCriterion("h5_client_version_id is not null");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdEqualTo(Long value) {
			addCriterion("h5_client_version_id =", value, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdNotEqualTo(Long value) {
			addCriterion("h5_client_version_id <>", value, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdGreaterThan(Long value) {
			addCriterion("h5_client_version_id >", value, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdGreaterThanOrEqualTo(Long value) {
			addCriterion("h5_client_version_id >=", value, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdLessThan(Long value) {
			addCriterion("h5_client_version_id <", value, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdLessThanOrEqualTo(Long value) {
			addCriterion("h5_client_version_id <=", value, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdIn(List<Long> values) {
			addCriterion("h5_client_version_id in", values, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdNotIn(List<Long> values) {
			addCriterion("h5_client_version_id not in", values, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdBetween(Long value1, Long value2) {
			addCriterion("h5_client_version_id between", value1, value2, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andH5ClientVersionIdNotBetween(Long value1, Long value2) {
			addCriterion("h5_client_version_id not between", value1, value2, "h5ClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdIsNull() {
			addCriterion("app_client_version_id is null");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdIsNotNull() {
			addCriterion("app_client_version_id is not null");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdEqualTo(Long value) {
			addCriterion("app_client_version_id =", value, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdNotEqualTo(Long value) {
			addCriterion("app_client_version_id <>", value, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdGreaterThan(Long value) {
			addCriterion("app_client_version_id >", value, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdGreaterThanOrEqualTo(Long value) {
			addCriterion("app_client_version_id >=", value, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdLessThan(Long value) {
			addCriterion("app_client_version_id <", value, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdLessThanOrEqualTo(Long value) {
			addCriterion("app_client_version_id <=", value, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdIn(List<Long> values) {
			addCriterion("app_client_version_id in", values, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdNotIn(List<Long> values) {
			addCriterion("app_client_version_id not in", values, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdBetween(Long value1, Long value2) {
			addCriterion("app_client_version_id between", value1, value2, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andAppClientVersionIdNotBetween(Long value1, Long value2) {
			addCriterion("app_client_version_id not between", value1, value2, "appClientVersionId");
			return (Criteria) this;
		}

		public Criteria andUserAgentIsNull() {
			addCriterion("user_agent is null");
			return (Criteria) this;
		}

		public Criteria andUserAgentIsNotNull() {
			addCriterion("user_agent is not null");
			return (Criteria) this;
		}

		public Criteria andUserAgentEqualTo(String value) {
			addCriterion("user_agent =", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentNotEqualTo(String value) {
			addCriterion("user_agent <>", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentGreaterThan(String value) {
			addCriterion("user_agent >", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentGreaterThanOrEqualTo(String value) {
			addCriterion("user_agent >=", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentLessThan(String value) {
			addCriterion("user_agent <", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentLessThanOrEqualTo(String value) {
			addCriterion("user_agent <=", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentLike(String value) {
			addCriterion("user_agent like", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentNotLike(String value) {
			addCriterion("user_agent not like", value, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentIn(List<String> values) {
			addCriterion("user_agent in", values, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentNotIn(List<String> values) {
			addCriterion("user_agent not in", values, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentBetween(String value1, String value2) {
			addCriterion("user_agent between", value1, value2, "userAgent");
			return (Criteria) this;
		}

		public Criteria andUserAgentNotBetween(String value1, String value2) {
			addCriterion("user_agent not between", value1, value2, "userAgent");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table h5_app_download_log
	 * @mbg.generated  Wed Mar 14 11:28:14 CST 2018
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h5_app_download_log
     *
     * @mbg.generated do_not_delete_during_merge Wed Mar 14 11:16:59 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}