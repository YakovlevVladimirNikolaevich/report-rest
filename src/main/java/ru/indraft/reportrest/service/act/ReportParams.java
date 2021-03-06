package ru.indraft.reportrest.service.act;

import org.springframework.context.annotation.Description;

@Description(value = "Jasper Report Params Constants.")
public final class ReportParams {

    /**
     * Номер акта
     */
    public static final String ACT_NUMBER = "ACT_NUMBER";

    /**
     * Номер договора
     */
    public static final String CONTRACT_NUMBER = "CONTRACT_NUMBER";

    /**
     * Год договора
     */
    public static final String CONTRACT_YEAR = "CONTRACT_YEAR";

    /**
     * Дата договора
     */
    public static final String CONTRACT_DATE = "CONTRACT_DATE";

    /**
     * ФИО в родительном падеже
     */
    public static final String GENETIVE_FULL_NAME = "GENETIVE_FULL_NAME";

    /**
     * ФИО c сокращенными именем и отчеством
     */
    public static final String SHORT_FULL_NAME = "SHORT_FULL_NAME";

    /**
     * Серия ИП
     */
    public static final String PE_SERIES = "PE_SERIES";

    /**
     * Номер ИП с серией
     */
    public static final String PE_NUMBER = "PE_NUMBER";

    /**
     * Флаг, что новая версия документа о создании ИП без серии и с датой.
     */
    public static final String IS_NEW_PE_VERSION = "IS_NEW_PE_VERSION";

    /**
     * Дата создания ИП
     */
    public static final String PE_DATE = "PE_DATE";

    /**
     * Отчетный период отчета
     */
    public static final String ACCOUNT_PERIOD = "ACCOUNT_PERIOD";

    /**
     * Итоговая стоимость услуг
     */
    public static final String TOTAL_COST = "TOTAL_COST";

    /**
     * Итоговая стоимость услуг прописью
     */
    public static final String TOTAL_COST_IN_WORDS = "TOTAL_COST_IN_WORDS";

    /**
     * Private constructor - can not be instantiated.
     */
    private ReportParams() {
    }
}
