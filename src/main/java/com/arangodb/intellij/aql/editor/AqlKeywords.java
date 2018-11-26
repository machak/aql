package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.util.Icons;
import com.google.common.collect.Sets;
import com.intellij.codeInsight.lookup.LookupElement;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public final class AqlKeywords {

    public static final Collection<String> KEYWORDS = Sets.newHashSet(
            "SEARCH",
            "PHRASE",
            "SHORTEST_PATH",
            "REPLACE",
            "ASC",
            "AGGREGATE",
            "FILTER",
            "DESC",
            "IN",
            "INTO",
            "LIMIT",
            "UPDATE",
            "SORT",
            "GRAPH",
            "FOR",
            "LET",
            "COLLECT",
            "WITH",
            "DISTINCT",
            "RETURN",
            "UPSERT",
            "REMOVE",
            "INSERT",
            "INTERSECTION",
            "OUTBOUND",
            "INBOUND",
            "ANY",
            "ALL",
            "NULL",
            "AND",
            "_key",
            "_id",
            "_from",
            "_to"
    );
    public static final Collection<String> FUNCTIONS = Sets.newHashSet(
            "TFIDF",
            "MIN_MATCH",
            "PHRASE",
            "EXISTS",
            "TOKENS",
            "WITHIN_RECTANGLE",
            "WARN",
            "WITHIN",
            "PREGEL_RESULT",
            "NOOPT",
            "VERSION",
            "FULLTEXT",
            "COLLECTIONS",
            "PARSE_IDENTIFIER",
            "FIRST_DOCUMENT",
            "NOT_NULL",
            "DATE_COMPARE",
            "DATE_ADD",
            "NEAR",
            "DATE_DAYS_IN_MONTH",
            "DATE_FORMAT",
            "DATE_LEAPYEAR",
            "DATE_DAYOFYEAR",
            "DATE_SECOND",
            "DATE_YEAR",
            "ASSERT",
            "DATE_TIMESTAMP",
            "GEO_MULTILINESTRING",
            "GEO_LINESTRING",
            "GEO_POLYGON",
            "DISTANCE",
            "DOCUMENT",
            "ZIP",
            "TRANSLATE",
            "KEEP",
            "UNSET_RECURSIVE",
            "GEO_EQUALS",
            "UNSET",
            "MATCHES",
            "BOOST",
            "MERGE",
            "CURRENT_DATABASE",
            "KEYS",
            "HAS",
            "DATE_DAYOFWEEK",
            "CALL",
            "REMOVE_NTH",
            "REMOVE_VALUES",
            "SHIFT",
            "CONTAINS_ARRAY",
            "POSITION",
            "GEO_DISTANCE",
            "NTH",
            "REMOVE_VALUE",
            "FIRST",
            "DATE_HOUR",
            "REVERSE",
            "SLICE",
            "ANALYZER",
            "LEVENSHTEIN_DISTANCE",
            "DATE_ISOWEEK",
            "SOUNDEX",
            "SIN",
            "EXP2",
            "ENCODE_URI_COMPONENT",
            "SHA512",
            "PUSH",
            "SHA1",
            "SUBSTITUTE",
            "FLOOR",
            "DATE_MILLISECOND",
            "TO_BASE64",
            "HASH",
            "IS_SAME_COLLECTION",
            "PASSTHRU",
            "GEO_CONTAINS",
            "LTRIM",
            "FIND_FIRST",
            "RTRIM",
            "UNION",
            "UNIQUE",
            "SUM",
            "REGEX_REPLACE",
            "REGEX_SPLIT",
            "DATE_DIFF",
            "APPLY",
            "SQRT",
            "LIKE",
            "SPLIT",
            "REGEX_MATCHES",
            "CONTAINS",
            "DATE_NOW",
            "VARIANCE_POPULATION",
            "FAIL",
            "VARIANCE",
            "SORTED_UNIQUE",
            "VALUES",
            "LEFT",
            "V8",
            "IS_BOOL",
            "DATE_ISO8601",
            "ASIN",
            "IS_ARRAY",
            "TO_NUMBER",
            "COLLECTION_COUNT",
            "IS_IN_POLYGON",
            "IS_STRING",
            "MD5",
            "CEIL",
            "TYPENAME",
            "STARTS_WITH",
            "JSON_PARSE",
            "FLATTEN",
            "APPEND",
            "UPPER",
            "RIGHT",
            "ROUND",
            "TAN",
            "TAN2",
            "MAX",
            "TO_BOOL",
            "IS_NUMBER",
            "TO_ARRAY",
            "STDDEV_POPULATION",
            "MEDIAN",
            "IS_KEY",
            "IS_NULL",
            "DATE_DAY",
            "TO_LIST",
            "JSON_STRINGIFY",
            "FIND_LAST",
            "GEO_POINT",
            "TO_STRING",
            "CONCAT",
            "GEO_MULTIPOINT",
            "SORTED",
            "CHAR_LENGTH",
            "CONCAT_SEPARATOR",
            "SUBSTRING",
            "COS",
            "MIN",
            "LOWER",
            "COUNT_UNIQUE",
            "RANDOM_TOKEN",
            "UUID",
            "ABS",
            "LOG",
            "RADIANS",
            "VARIANCE_SAMPLE",
            "LOG2",
            "GEO_INTERSECTS",
            "POW",
            "LOG10",
            "ATTRIBUTES",
            "LAST",
            "TRIM",
            "EXP",
            "FIRST_LIST",
            "LENGTH",
            "IS_LIST",
            "ACOS",
            "ATAN",
            "ATAN2",
            "DATE_QUARTER",
            "COUNT",
            "CURRENT_USER",
            "MERGE_RECURSIVE",
            "DEGREES",
            "PI",
            "RAND",
            "PERCENTILE",
            "BM25",
            "RANGE",
            "SLEEP",
            "UNION_DISTINCT",
            "STDDEV",
            "DATE_MONTH",
            "IS_DOCUMENT",
            "MINUS",
            "UNSHIFT",
            "POP",
            "REGEX_TEST",
            "OUTERSECTION",
            "DATE_SUBTRACT",
            "TO_HEX",
            "INTERSECTION",
            "AVERAGE",
            "DATE_MINUTE",
            "IS_DATESTRING",
            "AVG",
            "DATE_TRUNC",
            "IS_OBJECT",
            "STDDEV_SAMPLE",
            "COUNT_DISTINCT"
    );

    public static final List<LookupElement> KEYWORD_LOOKUP_ELEMENTS = KEYWORDS.stream()
            .map(AqlKeywordElement::new)
            .map(AqlKeywordElement::createLookupElement)
            .collect(Collectors.toList());
    public static final List<LookupElement> FUNCTION_LOOKUP_ELEMENTS = FUNCTIONS.stream()
            .map(name -> new AqlKeywordElement(name, Icons.ICON_FUNCTION))
            .map(AqlKeywordElement::createLookupElement)
            .collect(Collectors.toList());
    public static final List<LookupElement> ALL = KEYWORD_LOOKUP_ELEMENTS;

    static {
        ALL.addAll(FUNCTION_LOOKUP_ELEMENTS);
    }

    private AqlKeywords() {

    }
}
