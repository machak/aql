// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.arangodb.intellij.aql.grammar.custom.AqlElementType;
import com.arangodb.intellij.aql.grammar.custom.AqlTokenType;
import com.arangodb.intellij.aql.grammar.generated.psi.impl.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface AqlTypes {

  IElementType ANY_NUMBER = new AqlElementType("ANY_NUMBER");
    IElementType ANY_TYPE = new AqlElementType("ANY_TYPE");
    IElementType ARRAY_REF = new AqlElementType("ARRAY_REF");
  IElementType ARRAY_TYPE = new AqlElementType("ARRAY_TYPE");
  IElementType BLOCK_COMMENT = new AqlElementType("BLOCK_COMMENT");
  IElementType BOOLEAN_TYPE = new AqlElementType("BOOLEAN_TYPE");
  IElementType COMMENT = new AqlElementType("COMMENT");
    IElementType COMPLEX_JSON_VALUE = new AqlElementType("COMPLEX_JSON_VALUE");
  IElementType EXPRESSION_TYPE = new AqlElementType("EXPRESSION_TYPE");
  IElementType FUNCTION_EXPRESSION = new AqlElementType("FUNCTION_EXPRESSION");
  IElementType FUN_ABS = new AqlElementType("FUN_ABS");
  IElementType FUN_ACOS = new AqlElementType("FUN_ACOS");
    IElementType FUN_APPEND = new AqlElementType("FUN_APPEND");
  IElementType FUN_ASIN = new AqlElementType("FUN_ASIN");
  IElementType FUN_ATAN = new AqlElementType("FUN_ATAN");
  IElementType FUN_ATAN_2 = new AqlElementType("FUN_ATAN_2");
    IElementType FUN_ATTRIBUTES = new AqlElementType("FUN_ATTRIBUTES");
  IElementType FUN_AVERAGE = new AqlElementType("FUN_AVERAGE");
  IElementType FUN_AVG = new AqlElementType("FUN_AVG");
  IElementType FUN_CEIL = new AqlElementType("FUN_CEIL");
    IElementType FUN_CHAR_LENGTH = new AqlElementType("FUN_CHAR_LENGTH");
  IElementType FUN_CONCAT_SEPARATOR = new AqlElementType("FUN_CONCAT_SEPARATOR");
    IElementType FUN_CONTAINS_ARRAY = new AqlElementType("FUN_CONTAINS_ARRAY");
  IElementType FUN_COS = new AqlElementType("FUN_COS");
    IElementType FUN_COUNT = new AqlElementType("FUN_COUNT");
    IElementType FUN_COUNT_DISTINCT = new AqlElementType("FUN_COUNT_DISTINCT");
    IElementType FUN_COUNT_UNIQUE = new AqlElementType("FUN_COUNT_UNIQUE");
  IElementType FUN_DEGREES = new AqlElementType("FUN_DEGREES");
  IElementType FUN_EXP = new AqlElementType("FUN_EXP");
  IElementType FUN_EXP_2 = new AqlElementType("FUN_EXP_2");
    IElementType FUN_FIRST = new AqlElementType("FUN_FIRST");
    IElementType FUN_FLATTEN = new AqlElementType("FUN_FLATTEN");
  IElementType FUN_FLOOR = new AqlElementType("FUN_FLOOR");
    IElementType FUN_FULL_TEXT = new AqlElementType("FUN_FULL_TEXT");
    IElementType FUN_HAS = new AqlElementType("FUN_HAS");
    IElementType FUN_INTER_SECTION = new AqlElementType("FUN_INTER_SECTION");
    IElementType FUN_IS_ARRAY = new AqlElementType("FUN_IS_ARRAY");
    IElementType FUN_IS_BOOL = new AqlElementType("FUN_IS_BOOL");
    IElementType FUN_IS_DATE_STRING = new AqlElementType("FUN_IS_DATE_STRING");
    IElementType FUN_IS_DOCUMENT = new AqlElementType("FUN_IS_DOCUMENT");
    IElementType FUN_IS_KEY = new AqlElementType("FUN_IS_KEY");
    IElementType FUN_IS_LIST = new AqlElementType("FUN_IS_LIST");
    IElementType FUN_IS_NULL = new AqlElementType("FUN_IS_NULL");
    IElementType FUN_IS_NUMBER = new AqlElementType("FUN_IS_NUMBER");
    IElementType FUN_IS_OBJECT = new AqlElementType("FUN_IS_OBJECT");
    IElementType FUN_IS_SAME_COLLECTION = new AqlElementType("FUN_IS_SAME_COLLECTION");
    IElementType FUN_IS_STRING = new AqlElementType("FUN_IS_STRING");
    IElementType FUN_KEEP = new AqlElementType("FUN_KEEP");
    IElementType FUN_LAST = new AqlElementType("FUN_LAST");
    IElementType FUN_LENGTH = new AqlElementType("FUN_LENGTH");
  IElementType FUN_LOG = new AqlElementType("FUN_LOG");
  IElementType FUN_LOG_10 = new AqlElementType("FUN_LOG_10");
  IElementType FUN_LOG_2 = new AqlElementType("FUN_LOG_2");
    IElementType FUN_MATCHES = new AqlElementType("FUN_MATCHES");
  IElementType FUN_MAX = new AqlElementType("FUN_MAX");
  IElementType FUN_MEDIAN = new AqlElementType("FUN_MEDIAN");
  IElementType FUN_MIN = new AqlElementType("FUN_MIN");
    IElementType FUN_MINUS = new AqlElementType("FUN_MINUS");
    IElementType FUN_NTH = new AqlElementType("FUN_NTH");
    IElementType FUN_OUTER_SECTION = new AqlElementType("FUN_OUTER_SECTION");
  IElementType FUN_PERCENTILE = new AqlElementType("FUN_PERCENTILE");
  IElementType FUN_PI = new AqlElementType("FUN_PI");
    IElementType FUN_POP = new AqlElementType("FUN_POP");
    IElementType FUN_POSITION = new AqlElementType("FUN_POSITION");
  IElementType FUN_POW = new AqlElementType("FUN_POW");
    IElementType FUN_PUSH = new AqlElementType("FUN_PUSH");
  IElementType FUN_RADIANS = new AqlElementType("FUN_RADIANS");
  IElementType FUN_RAND = new AqlElementType("FUN_RAND");
  IElementType FUN_RANGE = new AqlElementType("FUN_RANGE");
    IElementType FUN_REMOVE_NTH = new AqlElementType("FUN_REMOVE_NTH");
    IElementType FUN_REMOVE_VALUE = new AqlElementType("FUN_REMOVE_VALUE");
    IElementType FUN_REMOVE_VALUES = new AqlElementType("FUN_REMOVE_VALUES");
    IElementType FUN_REVERSE = new AqlElementType("FUN_REVERSE");
  IElementType FUN_ROUND = new AqlElementType("FUN_ROUND");
    IElementType FUN_SHIFT = new AqlElementType("FUN_SHIFT");
  IElementType FUN_SIN = new AqlElementType("FUN_SIN");
    IElementType FUN_SLICE = new AqlElementType("FUN_SLICE");
    IElementType FUN_SORTED = new AqlElementType("FUN_SORTED");
    IElementType FUN_SORTED_UNIQUE = new AqlElementType("FUN_SORTED_UNIQUE");
  IElementType FUN_SQRT = new AqlElementType("FUN_SQRT");
  IElementType FUN_STDDEV = new AqlElementType("FUN_STDDEV");
  IElementType FUN_STDDEV_POPULATION = new AqlElementType("FUN_STDDEV_POPULATION");
  IElementType FUN_SUM = new AqlElementType("FUN_SUM");
  IElementType FUN_TAN = new AqlElementType("FUN_TAN");
  IElementType FUN_TAN_2 = new AqlElementType("FUN_TAN_2");
    IElementType FUN_TO_ARRAY = new AqlElementType("FUN_TO_ARRAY");
    IElementType FUN_TO_BOOL = new AqlElementType("FUN_TO_BOOL");
    IElementType FUN_TO_LIST = new AqlElementType("FUN_TO_LIST");
    IElementType FUN_TO_NUMBER = new AqlElementType("FUN_TO_NUMBER");
    IElementType FUN_TO_STRING = new AqlElementType("FUN_TO_STRING");
    IElementType FUN_TYPENAME = new AqlElementType("FUN_TYPENAME");
    IElementType FUN_UNION = new AqlElementType("FUN_UNION");
    IElementType FUN_UNION_DISTINCT = new AqlElementType("FUN_UNION_DISTINCT");
    IElementType FUN_UNIQUE = new AqlElementType("FUN_UNIQUE");
    IElementType FUN_UN_SHIFT = new AqlElementType("FUN_UN_SHIFT");
  IElementType FUN_VARIANCE = new AqlElementType("FUN_VARIANCE");
  IElementType FUN_VARIANCE_POPULATION = new AqlElementType("FUN_VARIANCE_POPULATION");
  IElementType FUN_VARIANCE_SAMPLE = new AqlElementType("FUN_VARIANCE_SAMPLE");
  IElementType INTEGER_TYPE = new AqlElementType("INTEGER_TYPE");
  IElementType JSON_TYPE = new AqlElementType("JSON_TYPE");
  IElementType KEYWORD_FUNCTIONS = new AqlElementType("KEYWORD_FUNCTIONS");
  IElementType KEYWORD_STATEMENTS = new AqlElementType("KEYWORD_STATEMENTS");
  IElementType LINE_COMMENT = new AqlElementType("LINE_COMMENT");
  IElementType NAMED_FUNCTIONS = new AqlElementType("NAMED_FUNCTIONS");
  IElementType NAMED_KEYWORD_FUNCTIONS = new AqlElementType("NAMED_KEYWORD_FUNCTIONS");
  IElementType NAMED_KEYWORD_STATEMENTS = new AqlElementType("NAMED_KEYWORD_STATEMENTS");
  IElementType NUMBER_TYPE = new AqlElementType("NUMBER_TYPE");
  IElementType OBJECT_EXPRESSION = new AqlElementType("OBJECT_EXPRESSION");
  IElementType OPERATOR_STATEMENTS = new AqlElementType("OPERATOR_STATEMENTS");
  IElementType PARAMETER_VARIABLE = new AqlElementType("PARAMETER_VARIABLE");
  IElementType PROPERTY_LOOKUP = new AqlElementType("PROPERTY_LOOKUP");
  IElementType PROPERTY_NAME = new AqlElementType("PROPERTY_NAME");
  IElementType QUERY_ITEM = new AqlElementType("QUERY_ITEM");
  IElementType RESERVED_WORDS = new AqlElementType("RESERVED_WORDS");
  IElementType SEQUENCE = new AqlElementType("SEQUENCE");
  IElementType SIGNED_INTEGER = new AqlElementType("SIGNED_INTEGER");
  IElementType STATEMENT = new AqlElementType("STATEMENT");
  IElementType STRING_TYPE = new AqlElementType("STRING_TYPE");
  IElementType SYSTEM_PROPERTY = new AqlElementType("SYSTEM_PROPERTY");
  IElementType VARIABLE_PLACE_HOLDER = new AqlElementType("VARIABLE_PLACE_HOLDER");

  IElementType B_COMMENT = new AqlTokenType("B_COMMENT");
  IElementType DOLLAR = new AqlTokenType("$");
  IElementType DOT = new AqlTokenType(".");
  IElementType DOUBLE_QUOTE = new AqlTokenType("\"");
  IElementType F_ABS = new AqlTokenType("F_ABS");
  IElementType F_ACOS = new AqlTokenType("F_ACOS");
  IElementType F_ANALYZER = new AqlTokenType("F_ANALYZER");
  IElementType F_APPEND = new AqlTokenType("F_APPEND");
  IElementType F_APPLY = new AqlTokenType("F_APPLY");
  IElementType F_ASIN = new AqlTokenType("F_ASIN");
  IElementType F_ASSERT = new AqlTokenType("F_ASSERT");
  IElementType F_ATAN = new AqlTokenType("F_ATAN");
  IElementType F_ATAN2 = new AqlTokenType("F_ATAN2");
  IElementType F_ATTRIBUTES = new AqlTokenType("F_ATTRIBUTES");
  IElementType F_AVERAGE = new AqlTokenType("F_AVERAGE");
  IElementType F_AVG = new AqlTokenType("F_AVG");
  IElementType F_BM25 = new AqlTokenType("F_BM25");
  IElementType F_BOOST = new AqlTokenType("F_BOOST");
  IElementType F_CALL = new AqlTokenType("F_CALL");
  IElementType F_CEIL = new AqlTokenType("F_CEIL");
  IElementType F_CHAR_LENGTH = new AqlTokenType("F_CHAR_LENGTH");
  IElementType F_COLLECTIONS = new AqlTokenType("F_COLLECTIONS");
  IElementType F_COLLECTION_COUNT = new AqlTokenType("F_COLLECTION_COUNT");
  IElementType F_CONCAT = new AqlTokenType("F_CONCAT");
  IElementType F_CONCAT_SEPARATOR = new AqlTokenType("F_CONCAT_SEPARATOR");
  IElementType F_CONTAINS = new AqlTokenType("F_CONTAINS");
  IElementType F_CONTAINS_ARRAY = new AqlTokenType("F_CONTAINS_ARRAY");
  IElementType F_COS = new AqlTokenType("F_COS");
  IElementType F_COUNT = new AqlTokenType("F_COUNT");
  IElementType F_COUNT_DISTINCT = new AqlTokenType("F_COUNT_DISTINCT");
  IElementType F_COUNT_UNIQUE = new AqlTokenType("F_COUNT_UNIQUE");
  IElementType F_CURRENT_DATABASE = new AqlTokenType("F_CURRENT_DATABASE");
  IElementType F_CURRENT_USER = new AqlTokenType("F_CURRENT_USER");
  IElementType F_DATE_ADD = new AqlTokenType("F_DATE_ADD");
  IElementType F_DATE_COMPARE = new AqlTokenType("F_DATE_COMPARE");
  IElementType F_DATE_DAY = new AqlTokenType("F_DATE_DAY");
  IElementType F_DATE_DAYOFWEEK = new AqlTokenType("F_DATE_DAYOFWEEK");
  IElementType F_DATE_DAYOFYEAR = new AqlTokenType("F_DATE_DAYOFYEAR");
  IElementType F_DATE_DAYS_IN_MONTH = new AqlTokenType("F_DATE_DAYS_IN_MONTH");
  IElementType F_DATE_DIFF = new AqlTokenType("F_DATE_DIFF");
  IElementType F_DATE_FORMAT = new AqlTokenType("F_DATE_FORMAT");
  IElementType F_DATE_HOUR = new AqlTokenType("F_DATE_HOUR");
  IElementType F_DATE_ISO8601 = new AqlTokenType("F_DATE_ISO8601");
  IElementType F_DATE_ISOWEEK = new AqlTokenType("F_DATE_ISOWEEK");
  IElementType F_DATE_LEAPYEAR = new AqlTokenType("F_DATE_LEAPYEAR");
  IElementType F_DATE_MILLISECOND = new AqlTokenType("F_DATE_MILLISECOND");
  IElementType F_DATE_MINUTE = new AqlTokenType("F_DATE_MINUTE");
  IElementType F_DATE_MONTH = new AqlTokenType("F_DATE_MONTH");
  IElementType F_DATE_NOW = new AqlTokenType("F_DATE_NOW");
  IElementType F_DATE_QUARTER = new AqlTokenType("F_DATE_QUARTER");
  IElementType F_DATE_SECOND = new AqlTokenType("F_DATE_SECOND");
  IElementType F_DATE_SUBTRACT = new AqlTokenType("F_DATE_SUBTRACT");
  IElementType F_DATE_TIMESTAMP = new AqlTokenType("F_DATE_TIMESTAMP");
  IElementType F_DATE_TRUNC = new AqlTokenType("F_DATE_TRUNC");
  IElementType F_DATE_YEAR = new AqlTokenType("F_DATE_YEAR");
  IElementType F_DEGREES = new AqlTokenType("F_DEGREES");
  IElementType F_DISTANCE = new AqlTokenType("F_DISTANCE");
  IElementType F_DOCUMENT = new AqlTokenType("F_DOCUMENT");
  IElementType F_ENCODE_URI_COMPONENT = new AqlTokenType("F_ENCODE_URI_COMPONENT");
  IElementType F_EXISTS = new AqlTokenType("F_EXISTS");
  IElementType F_EXP = new AqlTokenType("F_EXP");
  IElementType F_EXP2 = new AqlTokenType("F_EXP2");
  IElementType F_FAIL = new AqlTokenType("F_FAIL");
  IElementType F_FIND_FIRST = new AqlTokenType("F_FIND_FIRST");
  IElementType F_FIND_LAST = new AqlTokenType("F_FIND_LAST");
  IElementType F_FIRST = new AqlTokenType("F_FIRST");
  IElementType F_FIRST_DOCUMENT = new AqlTokenType("F_FIRST_DOCUMENT");
  IElementType F_FIRST_LIST = new AqlTokenType("F_FIRST_LIST");
  IElementType F_FLATTEN = new AqlTokenType("F_FLATTEN");
  IElementType F_FLOOR = new AqlTokenType("F_FLOOR");
  IElementType F_FULLTEXT = new AqlTokenType("F_FULLTEXT");
  IElementType F_GEO_CONTAINS = new AqlTokenType("F_GEO_CONTAINS");
  IElementType F_GEO_DISTANCE = new AqlTokenType("F_GEO_DISTANCE");
  IElementType F_GEO_EQUALS = new AqlTokenType("F_GEO_EQUALS");
  IElementType F_GEO_INTERSECTS = new AqlTokenType("F_GEO_INTERSECTS");
  IElementType F_GEO_LINESTRING = new AqlTokenType("F_GEO_LINESTRING");
  IElementType F_GEO_MULTILINESTRING = new AqlTokenType("F_GEO_MULTILINESTRING");
  IElementType F_GEO_MULTIPOINT = new AqlTokenType("F_GEO_MULTIPOINT");
  IElementType F_GEO_POINT = new AqlTokenType("F_GEO_POINT");
  IElementType F_GEO_POLYGON = new AqlTokenType("F_GEO_POLYGON");
  IElementType F_HAS = new AqlTokenType("F_HAS");
  IElementType F_HASH = new AqlTokenType("F_HASH");
  IElementType F_INTERSECTION = new AqlTokenType("F_INTERSECTION");
  IElementType F_IS_ARRAY = new AqlTokenType("F_IS_ARRAY");
  IElementType F_IS_BOOL = new AqlTokenType("F_IS_BOOL");
  IElementType F_IS_DATESTRING = new AqlTokenType("F_IS_DATESTRING");
  IElementType F_IS_DOCUMENT = new AqlTokenType("F_IS_DOCUMENT");
  IElementType F_IS_IN_POLYGON = new AqlTokenType("F_IS_IN_POLYGON");
  IElementType F_IS_KEY = new AqlTokenType("F_IS_KEY");
  IElementType F_IS_LIST = new AqlTokenType("F_IS_LIST");
  IElementType F_IS_NULL = new AqlTokenType("F_IS_NULL");
  IElementType F_IS_NUMBER = new AqlTokenType("F_IS_NUMBER");
  IElementType F_IS_OBJECT = new AqlTokenType("F_IS_OBJECT");
  IElementType F_IS_SAME_COLLECTION = new AqlTokenType("F_IS_SAME_COLLECTION");
  IElementType F_IS_STRING = new AqlTokenType("F_IS_STRING");
  IElementType F_JSON_PARSE = new AqlTokenType("F_JSON_PARSE");
  IElementType F_JSON_STRINGIFY = new AqlTokenType("F_JSON_STRINGIFY");
  IElementType F_KEEP = new AqlTokenType("F_KEEP");
  IElementType F_KEYS = new AqlTokenType("F_KEYS");
  IElementType F_LAST = new AqlTokenType("F_LAST");
  IElementType F_LEFT = new AqlTokenType("F_LEFT");
  IElementType F_LENGTH = new AqlTokenType("F_LENGTH");
  IElementType F_LEVENSHTEIN_DISTANCE = new AqlTokenType("F_LEVENSHTEIN_DISTANCE");
  IElementType F_LIKE = new AqlTokenType("F_LIKE");
  IElementType F_LOG = new AqlTokenType("F_LOG");
  IElementType F_LOG10 = new AqlTokenType("F_LOG10");
  IElementType F_LOG2 = new AqlTokenType("F_LOG2");
  IElementType F_LOWER = new AqlTokenType("F_LOWER");
  IElementType F_LTRIM = new AqlTokenType("F_LTRIM");
  IElementType F_MATCHES = new AqlTokenType("F_MATCHES");
  IElementType F_MAX = new AqlTokenType("F_MAX");
  IElementType F_MD5 = new AqlTokenType("F_MD5");
  IElementType F_MEDIAN = new AqlTokenType("F_MEDIAN");
  IElementType F_MERGE = new AqlTokenType("F_MERGE");
  IElementType F_MERGE_RECURSIVE = new AqlTokenType("F_MERGE_RECURSIVE");
  IElementType F_MIN = new AqlTokenType("F_MIN");
  IElementType F_MINUS = new AqlTokenType("F_MINUS");
  IElementType F_MIN_MATCH = new AqlTokenType("F_MIN_MATCH");
  IElementType F_NEAR = new AqlTokenType("F_NEAR");
  IElementType F_NOOPT = new AqlTokenType("F_NOOPT");
  IElementType F_NOT_NULL = new AqlTokenType("F_NOT_NULL");
  IElementType F_NTH = new AqlTokenType("F_NTH");
  IElementType F_OUTERSECTION = new AqlTokenType("F_OUTERSECTION");
  IElementType F_PARSE_IDENTIFIER = new AqlTokenType("F_PARSE_IDENTIFIER");
  IElementType F_PASSTHRU = new AqlTokenType("F_PASSTHRU");
  IElementType F_PERCENTILE = new AqlTokenType("F_PERCENTILE");
  IElementType F_PHRASE = new AqlTokenType("F_PHRASE");
  IElementType F_PI = new AqlTokenType("F_PI");
  IElementType F_POP = new AqlTokenType("F_POP");
  IElementType F_POSITION = new AqlTokenType("F_POSITION");
  IElementType F_POW = new AqlTokenType("F_POW");
  IElementType F_PREGEL_RESULT = new AqlTokenType("F_PREGEL_RESULT");
  IElementType F_PUSH = new AqlTokenType("F_PUSH");
  IElementType F_RADIANS = new AqlTokenType("F_RADIANS");
  IElementType F_RAND = new AqlTokenType("F_RAND");
  IElementType F_RANDOM_TOKEN = new AqlTokenType("F_RANDOM_TOKEN");
  IElementType F_RANGE = new AqlTokenType("F_RANGE");
  IElementType F_REGEX_MATCHES = new AqlTokenType("F_REGEX_MATCHES");
  IElementType F_REGEX_REPLACE = new AqlTokenType("F_REGEX_REPLACE");
  IElementType F_REGEX_SPLIT = new AqlTokenType("F_REGEX_SPLIT");
  IElementType F_REGEX_TEST = new AqlTokenType("F_REGEX_TEST");
  IElementType F_REMOVE_NTH = new AqlTokenType("F_REMOVE_NTH");
  IElementType F_REMOVE_VALUE = new AqlTokenType("F_REMOVE_VALUE");
  IElementType F_REMOVE_VALUES = new AqlTokenType("F_REMOVE_VALUES");
  IElementType F_REVERSE = new AqlTokenType("F_REVERSE");
  IElementType F_RIGHT = new AqlTokenType("F_RIGHT");
  IElementType F_ROUND = new AqlTokenType("F_ROUND");
  IElementType F_RTRIM = new AqlTokenType("F_RTRIM");
  IElementType F_SHA1 = new AqlTokenType("F_SHA1");
  IElementType F_SHA512 = new AqlTokenType("F_SHA512");
  IElementType F_SHIFT = new AqlTokenType("F_SHIFT");
  IElementType F_SIN = new AqlTokenType("F_SIN");
  IElementType F_SLEEP = new AqlTokenType("F_SLEEP");
  IElementType F_SLICE = new AqlTokenType("F_SLICE");
  IElementType F_SORTED = new AqlTokenType("F_SORTED");
  IElementType F_SORTED_UNIQUE = new AqlTokenType("F_SORTED_UNIQUE");
  IElementType F_SOUNDEX = new AqlTokenType("F_SOUNDEX");
  IElementType F_SPLIT = new AqlTokenType("F_SPLIT");
  IElementType F_SQRT = new AqlTokenType("F_SQRT");
  IElementType F_STARTS_WITH = new AqlTokenType("F_STARTS_WITH");
  IElementType F_STDDEV = new AqlTokenType("F_STDDEV");
  IElementType F_STDDEV_POPULATION = new AqlTokenType("F_STDDEV_POPULATION");
  IElementType F_STDDEV_SAMPLE = new AqlTokenType("F_STDDEV_SAMPLE");
  IElementType F_SUBSTITUTE = new AqlTokenType("F_SUBSTITUTE");
  IElementType F_SUBSTRING = new AqlTokenType("F_SUBSTRING");
  IElementType F_SUM = new AqlTokenType("F_SUM");
  IElementType F_TAN = new AqlTokenType("F_TAN");
  IElementType F_TAN2 = new AqlTokenType("F_TAN2");
  IElementType F_TFIDF = new AqlTokenType("F_TFIDF");
  IElementType F_TOKENS = new AqlTokenType("F_TOKENS");
  IElementType F_TO_ARRAY = new AqlTokenType("F_TO_ARRAY");
  IElementType F_TO_BASE64 = new AqlTokenType("F_TO_BASE64");
  IElementType F_TO_BOOL = new AqlTokenType("F_TO_BOOL");
  IElementType F_TO_HEX = new AqlTokenType("F_TO_HEX");
  IElementType F_TO_LIST = new AqlTokenType("F_TO_LIST");
  IElementType F_TO_NUMBER = new AqlTokenType("F_TO_NUMBER");
  IElementType F_TO_STRING = new AqlTokenType("F_TO_STRING");
  IElementType F_TRANSLATE = new AqlTokenType("F_TRANSLATE");
  IElementType F_TRIM = new AqlTokenType("F_TRIM");
  IElementType F_TYPENAME = new AqlTokenType("F_TYPENAME");
  IElementType F_UNION = new AqlTokenType("F_UNION");
  IElementType F_UNION_DISTINCT = new AqlTokenType("F_UNION_DISTINCT");
  IElementType F_UNIQUE = new AqlTokenType("F_UNIQUE");
  IElementType F_UNSET = new AqlTokenType("F_UNSET");
  IElementType F_UNSET_RECURSIVE = new AqlTokenType("F_UNSET_RECURSIVE");
  IElementType F_UNSHIFT = new AqlTokenType("F_UNSHIFT");
  IElementType F_UPPER = new AqlTokenType("F_UPPER");
  IElementType F_UUID = new AqlTokenType("F_UUID");
  IElementType F_V8 = new AqlTokenType("F_V8");
  IElementType F_VALUES = new AqlTokenType("F_VALUES");
  IElementType F_VARIANCE = new AqlTokenType("F_VARIANCE");
  IElementType F_VARIANCE_POPULATION = new AqlTokenType("F_VARIANCE_POPULATION");
  IElementType F_VARIANCE_SAMPLE = new AqlTokenType("F_VARIANCE_SAMPLE");
  IElementType F_VERSION = new AqlTokenType("F_VERSION");
  IElementType F_WARN = new AqlTokenType("F_WARN");
  IElementType F_WITHIN = new AqlTokenType("F_WITHIN");
  IElementType F_WITHIN_RECTANGLE = new AqlTokenType("F_WITHIN_RECTANGLE");
  IElementType F_ZIP = new AqlTokenType("F_ZIP");
  IElementType ID = new AqlTokenType("ID");
  IElementType L_COMMENT = new AqlTokenType("L_COMMENT");
  IElementType NUMBER = new AqlTokenType("NUMBER");
  IElementType NUMBER_INTEGER = new AqlTokenType("NUMBER_INTEGER");
  IElementType N_AT = new AqlTokenType("@");
  IElementType SINGLE_QUOTE = new AqlTokenType("'");
  IElementType TEXT_DOUBLE = new AqlTokenType("TEXT_DOUBLE");
  IElementType TEXT_SINGLE = new AqlTokenType("TEXT_SINGLE");
  IElementType T_AGGREGATE = new AqlTokenType("T_AGGREGATE");
  IElementType T_ALL = new AqlTokenType("T_ALL");
  IElementType T_AND = new AqlTokenType("T_AND");
  IElementType T_ANY = new AqlTokenType("T_ANY");
  IElementType T_ARRAY_CLOSE = new AqlTokenType("]");
  IElementType T_ARRAY_OPEN = new AqlTokenType("[");
  IElementType T_ASC = new AqlTokenType("T_ASC");
  IElementType T_CLOSE = new AqlTokenType(")");
  IElementType T_COLLECT = new AqlTokenType("T_COLLECT");
  IElementType T_COLON = new AqlTokenType(":");
  IElementType T_COMMA = new AqlTokenType(",");
  IElementType T_DESC = new AqlTokenType("T_DESC");
  IElementType T_DISTINCT = new AqlTokenType("T_DISTINCT");
  IElementType T_DIV = new AqlTokenType("/");
  IElementType T_EQ = new AqlTokenType("==");
  IElementType T_FALSE = new AqlTokenType("false");
  IElementType T_FILTER = new AqlTokenType("T_FILTER");
  IElementType T_FOR = new AqlTokenType("T_FOR");
  IElementType T_GE = new AqlTokenType(">=");
  IElementType T_GRAPH = new AqlTokenType("T_GRAPH");
  IElementType T_GT = new AqlTokenType(">");
  IElementType T_ID = new AqlTokenType("_id");
  IElementType T_IN = new AqlTokenType("T_IN");
  IElementType T_INBOUND = new AqlTokenType("T_INBOUND");
  IElementType T_INSERT = new AqlTokenType("T_INSERT");
  IElementType T_INTO = new AqlTokenType("T_INTO");
  IElementType T_IS = new AqlTokenType("=");
  IElementType T_KEY = new AqlTokenType("_key");
  IElementType T_LE = new AqlTokenType("<=");
  IElementType T_LET = new AqlTokenType("T_LET");
  IElementType T_LIKE = new AqlTokenType("like");
  IElementType T_LIMIT = new AqlTokenType("T_LIMIT");
  IElementType T_LOGICAL_AND = new AqlTokenType("&&");
  IElementType T_LT = new AqlTokenType("<");
  IElementType T_MINUS = new AqlTokenType("-");
  IElementType T_MOD = new AqlTokenType("%");
  IElementType T_NE = new AqlTokenType("!=");
  IElementType T_NIN = new AqlTokenType("T_NIN");
  IElementType T_NONE = new AqlTokenType("none");
  IElementType T_NOT = new AqlTokenType("not");
  IElementType T_NULL = new AqlTokenType("T_NULL");
  IElementType T_OBJECT_CLOSE = new AqlTokenType("}");
  IElementType T_OBJECT_OPEN = new AqlTokenType("{");
  IElementType T_OPEN = new AqlTokenType("(");
  IElementType T_OR = new AqlTokenType("||");
  IElementType T_OUTBOUND = new AqlTokenType("T_OUTBOUND");
    IElementType T_PLACHOLDER_START = new AqlTokenType("${");
  IElementType T_PLUS = new AqlTokenType("+");
  IElementType T_QUESTION = new AqlTokenType("?");
  IElementType T_RANGE = new AqlTokenType("..");
  IElementType T_REGEX_MATCH = new AqlTokenType("~=");
  IElementType T_REGEX_NON_MATCH = new AqlTokenType("~!");
  IElementType T_REMOVE = new AqlTokenType("T_REMOVE");
  IElementType T_REPLACE = new AqlTokenType("T_REPLACE");
  IElementType T_RETURN = new AqlTokenType("T_RETURN");
  IElementType T_SCOPE = new AqlTokenType("::");
  IElementType T_SEARCH = new AqlTokenType("T_SEARCH");
  IElementType T_SHORTEST_PATH = new AqlTokenType("T_SHORTEST_PATH");
  IElementType T_SORT = new AqlTokenType("T_SORT");
  IElementType T_SYS_FROM = new AqlTokenType("_from");
  IElementType T_SYS_TO = new AqlTokenType("_to");
  IElementType T_TIMES = new AqlTokenType("*");
  IElementType T_TRUE = new AqlTokenType("true");
  IElementType T_UPDATE = new AqlTokenType("T_UPDATE");
  IElementType T_UPSERT = new AqlTokenType("T_UPSERT");
  IElementType T_WITH = new AqlTokenType("T_WITH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANY_NUMBER) {
        return new AqlAnyNumberImpl(node);
      } else if (type == ANY_TYPE) {
          return new AqlAnyTypeImpl(node);
      } else if (type == ARRAY_REF) {
          return new AqlArrayRefImpl(node);
      } else if (type == ARRAY_TYPE) {
        return new AqlArrayTypeImpl(node);
      } else if (type == BLOCK_COMMENT) {
        return new AqlBlockCommentImpl(node);
      } else if (type == BOOLEAN_TYPE) {
        return new AqlBooleanTypeImpl(node);
      } else if (type == COMMENT) {
        return new AqlCommentImpl(node);
      } else if (type == COMPLEX_JSON_VALUE) {
          return new AqlComplexJsonValueImpl(node);
      } else if (type == EXPRESSION_TYPE) {
        return new AqlExpressionTypeImpl(node);
      } else if (type == FUNCTION_EXPRESSION) {
        return new AqlFunctionExpressionImpl(node);
      } else if (type == FUN_ABS) {
        return new AqlFunAbsImpl(node);
      } else if (type == FUN_ACOS) {
        return new AqlFunAcosImpl(node);
      } else if (type == FUN_APPEND) {
          return new AqlFunAppendImpl(node);
      } else if (type == FUN_ASIN) {
        return new AqlFunAsinImpl(node);
      } else if (type == FUN_ATAN) {
        return new AqlFunAtanImpl(node);
      } else if (type == FUN_ATAN_2) {
        return new AqlFunAtan2Impl(node);
      } else if (type == FUN_ATTRIBUTES) {
          return new AqlFunAttributesImpl(node);
      } else if (type == FUN_AVERAGE) {
        return new AqlFunAverageImpl(node);
      } else if (type == FUN_AVG) {
        return new AqlFunAvgImpl(node);
      } else if (type == FUN_CEIL) {
        return new AqlFunCeilImpl(node);
      } else if (type == FUN_CHAR_LENGTH) {
          return new AqlFunCharLengthImpl(node);
      } else if (type == FUN_CONCAT_SEPARATOR) {
        return new AqlFunConcatSeparatorImpl(node);
      } else if (type == FUN_CONTAINS_ARRAY) {
          return new AqlFunContainsArrayImpl(node);
      } else if (type == FUN_COS) {
        return new AqlFunCosImpl(node);
      } else if (type == FUN_COUNT) {
          return new AqlFunCountImpl(node);
      } else if (type == FUN_COUNT_DISTINCT) {
          return new AqlFunCountDistinctImpl(node);
      } else if (type == FUN_COUNT_UNIQUE) {
          return new AqlFunCountUniqueImpl(node);
      } else if (type == FUN_DEGREES) {
        return new AqlFunDegreesImpl(node);
      } else if (type == FUN_EXP) {
        return new AqlFunExpImpl(node);
      } else if (type == FUN_EXP_2) {
        return new AqlFunExp2Impl(node);
      } else if (type == FUN_FIRST) {
          return new AqlFunFirstImpl(node);
      } else if (type == FUN_FLATTEN) {
          return new AqlFunFlattenImpl(node);
      } else if (type == FUN_FLOOR) {
        return new AqlFunFloorImpl(node);
      } else if (type == FUN_FULL_TEXT) {
          return new AqlFunFullTextImpl(node);
      } else if (type == FUN_HAS) {
          return new AqlFunHasImpl(node);
      } else if (type == FUN_INTER_SECTION) {
          return new AqlFunInterSectionImpl(node);
      } else if (type == FUN_IS_ARRAY) {
          return new AqlFunIsArrayImpl(node);
      } else if (type == FUN_IS_BOOL) {
          return new AqlFunIsBoolImpl(node);
      } else if (type == FUN_IS_DATE_STRING) {
          return new AqlFunIsDateStringImpl(node);
      } else if (type == FUN_IS_DOCUMENT) {
          return new AqlFunIsDocumentImpl(node);
      } else if (type == FUN_IS_KEY) {
          return new AqlFunIsKeyImpl(node);
      } else if (type == FUN_IS_LIST) {
          return new AqlFunIsListImpl(node);
      } else if (type == FUN_IS_NULL) {
          return new AqlFunIsNullImpl(node);
      } else if (type == FUN_IS_NUMBER) {
          return new AqlFunIsNumberImpl(node);
      } else if (type == FUN_IS_OBJECT) {
          return new AqlFunIsObjectImpl(node);
      } else if (type == FUN_IS_SAME_COLLECTION) {
          return new AqlFunIsSameCollectionImpl(node);
      } else if (type == FUN_IS_STRING) {
          return new AqlFunIsStringImpl(node);
      } else if (type == FUN_KEEP) {
          return new AqlFunKeepImpl(node);
      } else if (type == FUN_LAST) {
          return new AqlFunLastImpl(node);
      } else if (type == FUN_LENGTH) {
          return new AqlFunLengthImpl(node);
      } else if (type == FUN_LOG) {
        return new AqlFunLogImpl(node);
      } else if (type == FUN_LOG_10) {
        return new AqlFunLog10Impl(node);
      } else if (type == FUN_LOG_2) {
        return new AqlFunLog2Impl(node);
      } else if (type == FUN_MATCHES) {
          return new AqlFunMatchesImpl(node);
      } else if (type == FUN_MAX) {
        return new AqlFunMaxImpl(node);
      } else if (type == FUN_MEDIAN) {
        return new AqlFunMedianImpl(node);
      } else if (type == FUN_MIN) {
        return new AqlFunMinImpl(node);
      } else if (type == FUN_MINUS) {
          return new AqlFunMinusImpl(node);
      } else if (type == FUN_NTH) {
          return new AqlFunNTHImpl(node);
      } else if (type == FUN_OUTER_SECTION) {
          return new AqlFunOuterSectionImpl(node);
      } else if (type == FUN_PERCENTILE) {
        return new AqlFunPercentileImpl(node);
      } else if (type == FUN_PI) {
        return new AqlFunPiImpl(node);
      } else if (type == FUN_POP) {
          return new AqlFunPopImpl(node);
      } else if (type == FUN_POSITION) {
          return new AqlFunPositionImpl(node);
      } else if (type == FUN_POW) {
        return new AqlFunPowImpl(node);
      } else if (type == FUN_PUSH) {
          return new AqlFunPushImpl(node);
      } else if (type == FUN_RADIANS) {
        return new AqlFunRadiansImpl(node);
      } else if (type == FUN_RAND) {
        return new AqlFunRandImpl(node);
      } else if (type == FUN_RANGE) {
        return new AqlFunRangeImpl(node);
      } else if (type == FUN_REMOVE_NTH) {
          return new AqlFunRemoveNTHImpl(node);
      } else if (type == FUN_REMOVE_VALUE) {
          return new AqlFunRemoveValueImpl(node);
      } else if (type == FUN_REMOVE_VALUES) {
          return new AqlFunRemoveValuesImpl(node);
      } else if (type == FUN_REVERSE) {
          return new AqlFunReverseImpl(node);
      } else if (type == FUN_ROUND) {
        return new AqlFunRoundImpl(node);
      } else if (type == FUN_SHIFT) {
          return new AqlFunShiftImpl(node);
      } else if (type == FUN_SIN) {
        return new AqlFunSinImpl(node);
      } else if (type == FUN_SLICE) {
          return new AqlFunSliceImpl(node);
      } else if (type == FUN_SORTED) {
          return new AqlFunSortedImpl(node);
      } else if (type == FUN_SORTED_UNIQUE) {
          return new AqlFunSortedUniqueImpl(node);
      } else if (type == FUN_SQRT) {
        return new AqlFunSQRTImpl(node);
      } else if (type == FUN_STDDEV) {
        return new AqlFunStddevImpl(node);
      } else if (type == FUN_STDDEV_POPULATION) {
        return new AqlFunStddevPopulationImpl(node);
      } else if (type == FUN_SUM) {
        return new AqlFunSumImpl(node);
      } else if (type == FUN_TAN) {
        return new AqlFunTanImpl(node);
      } else if (type == FUN_TAN_2) {
        return new AqlFunTan2Impl(node);
      } else if (type == FUN_TO_ARRAY) {
          return new AqlFunToArrayImpl(node);
      } else if (type == FUN_TO_BOOL) {
          return new AqlFunToBoolImpl(node);
      } else if (type == FUN_TO_LIST) {
          return new AqlFunToListImpl(node);
      } else if (type == FUN_TO_NUMBER) {
          return new AqlFunToNumberImpl(node);
      } else if (type == FUN_TO_STRING) {
          return new AqlFunToStringImpl(node);
      } else if (type == FUN_TYPENAME) {
          return new AqlFunTypenameImpl(node);
      } else if (type == FUN_UNION) {
          return new AqlFunUnionImpl(node);
      } else if (type == FUN_UNION_DISTINCT) {
          return new AqlFunUnionDistinctImpl(node);
      } else if (type == FUN_UNIQUE) {
          return new AqlFunUniqueImpl(node);
      } else if (type == FUN_UN_SHIFT) {
          return new AqlFunUnShiftImpl(node);
      } else if (type == FUN_VARIANCE) {
        return new AqlFunVarianceImpl(node);
      } else if (type == FUN_VARIANCE_POPULATION) {
        return new AqlFunVariancePopulationImpl(node);
      } else if (type == FUN_VARIANCE_SAMPLE) {
        return new AqlFunVarianceSampleImpl(node);
      } else if (type == INTEGER_TYPE) {
        return new AqlIntegerTypeImpl(node);
      } else if (type == JSON_TYPE) {
        return new AqlJsonTypeImpl(node);
      } else if (type == KEYWORD_FUNCTIONS) {
        return new AqlKeywordFunctionsImpl(node);
      } else if (type == KEYWORD_STATEMENTS) {
        return new AqlKeywordStatementsImpl(node);
      } else if (type == LINE_COMMENT) {
        return new AqlLineCommentImpl(node);
      } else if (type == NAMED_FUNCTIONS) {
        return new AqlNamedFunctionsImpl(node);
      } else if (type == NAMED_KEYWORD_FUNCTIONS) {
        return new AqlNamedKeywordFunctionsImpl(node);
      } else if (type == NAMED_KEYWORD_STATEMENTS) {
        return new AqlNamedKeywordStatementsImpl(node);
      } else if (type == NUMBER_TYPE) {
        return new AqlNumberTypeImpl(node);
      } else if (type == OBJECT_EXPRESSION) {
        return new AqlObjectExpressionImpl(node);
      } else if (type == OPERATOR_STATEMENTS) {
        return new AqlOperatorStatementsImpl(node);
      } else if (type == PARAMETER_VARIABLE) {
        return new AqlParameterVariableImpl(node);
      } else if (type == PROPERTY_LOOKUP) {
        return new AqlPropertyLookupImpl(node);
      } else if (type == PROPERTY_NAME) {
        return new AqlPropertyNameImpl(node);
      } else if (type == QUERY_ITEM) {
        return new AqlQueryItemImpl(node);
      } else if (type == RESERVED_WORDS) {
        return new AqlReservedWordsImpl(node);
      } else if (type == SEQUENCE) {
        return new AqlSequenceImpl(node);
      } else if (type == SIGNED_INTEGER) {
        return new AqlSignedIntegerImpl(node);
      } else if (type == STATEMENT) {
        return new AqlStatementImpl(node);
      } else if (type == STRING_TYPE) {
        return new AqlStringTypeImpl(node);
      } else if (type == SYSTEM_PROPERTY) {
        return new AqlSystemPropertyImpl(node);
      } else if (type == VARIABLE_PLACE_HOLDER) {
        return new AqlVariablePlaceHolderImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
