// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.arangodb.intellij.aql.grammar.custom.psi.AqlParserUtil.*;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AqlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
      if (t == ANALYZER_TYPE) {
          r = AnalyzerType(b, 0);
      } else if (t == ANY_NUMBER) {
      r = AnyNumber(b, 0);
      } else if (t == ANY_TYPE) {
          r = AnyType(b, 0);
      } else if (t == ARRAY_REF) {
          r = ArrayRef(b, 0);
      } else if (t == ARRAY_TYPE) {
      r = ArrayType(b, 0);
      } else if (t == BLOCK_COMMENT) {
      r = BlockComment(b, 0);
      } else if (t == BOOLEAN_TYPE) {
      r = BooleanType(b, 0);
      } else if (t == COMMENT) {
      r = Comment(b, 0);
      } else if (t == COMPLEX_JSON_VALUE) {
          r = ComplexJsonValue(b, 0);
      } else if (t == EXPRESSION_TYPE) {
      r = ExpressionType(b, 0);
      } else if (t == FUN_ABS) {
      r = FunAbs(b, 0);
      } else if (t == FUN_ACOS) {
      r = FunAcos(b, 0);
      } else if (t == FUN_APPEND) {
          r = FunAppend(b, 0);
      } else if (t == FUN_APPLY) {
          r = FunApply(b, 0);
      } else if (t == FUN_ASIN) {
      r = FunAsin(b, 0);
      } else if (t == FUN_ASSERT) {
          r = FunAssert(b, 0);
      } else if (t == FUN_ATAN) {
      r = FunAtan(b, 0);
      } else if (t == FUN_ATAN_2) {
      r = FunAtan2(b, 0);
      } else if (t == FUN_ATTRIBUTES) {
          r = FunAttributes(b, 0);
      } else if (t == FUN_AVERAGE) {
      r = FunAverage(b, 0);
      } else if (t == FUN_AVG) {
      r = FunAvg(b, 0);
      } else if (t == FUN_CALL) {
          r = FunCall(b, 0);
      } else if (t == FUN_CEIL) {
      r = FunCeil(b, 0);
      } else if (t == FUN_CHAR_LENGTH) {
          r = FunCharLength(b, 0);
      } else if (t == FUN_COLLECTION_COUNT) {
          r = FunCollectionCount(b, 0);
      } else if (t == FUN_COLLECTIONS) {
          r = FunCollections(b, 0);
      } else if (t == FUN_CONCAT) {
          r = FunConcat(b, 0);
      } else if (t == FUN_CONCAT_SEPARATOR) {
      r = FunConcatSeparator(b, 0);
      } else if (t == FUN_CONTAINS) {
          r = FunContains(b, 0);
      } else if (t == FUN_CONTAINS_ARRAY) {
          r = FunContainsArray(b, 0);
      } else if (t == FUN_COS) {
      r = FunCos(b, 0);
      } else if (t == FUN_COUNT) {
          r = FunCount(b, 0);
      } else if (t == FUN_COUNT_DISTINCT) {
          r = FunCountDistinct(b, 0);
      } else if (t == FUN_COUNT_UNIQUE) {
          r = FunCountUnique(b, 0);
      } else if (t == FUN_CURRENT_USER) {
          r = FunCurrentUser(b, 0);
      } else if (t == FUN_DEGREES) {
      r = FunDegrees(b, 0);
      } else if (t == FUN_DISTANCE) {
          r = FunDistance(b, 0);
      } else if (t == FUN_DOCUMENT) {
          r = FunDocument(b, 0);
      } else if (t == FUN_ENCODE_URI_COMPONENT) {
          r = FunEncodeUriComponent(b, 0);
      } else if (t == FUN_EXP) {
      r = FunExp(b, 0);
      } else if (t == FUN_EXP_2) {
      r = FunExp2(b, 0);
      } else if (t == FUN_FAIL) {
          r = FunFail(b, 0);
      } else if (t == FUN_FIND_FIRST) {
          r = FunFindFirst(b, 0);
      } else if (t == FUN_FIND_LAST) {
          r = FunFindLast(b, 0);
      } else if (t == FUN_FIRST) {
          r = FunFirst(b, 0);
      } else if (t == FUN_FIRST_DOCUMENT) {
          r = FunFirstDocument(b, 0);
      } else if (t == FUN_FIRST_LIST) {
          r = FunFirstList(b, 0);
      } else if (t == FUN_FLATTEN) {
          r = FunFlatten(b, 0);
      } else if (t == FUN_FLOOR) {
      r = FunFloor(b, 0);
      } else if (t == FUN_FULL_TEXT) {
          r = FunFullText(b, 0);
      } else if (t == FUN_GEO_CONTAINS) {
          r = FunGeoContains(b, 0);
      } else if (t == FUN_GEO_DISTANCE) {
          r = FunGeoDistance(b, 0);
      } else if (t == FUN_GEO_EQUALS) {
          r = FunGeoEquals(b, 0);
      } else if (t == FUN_GEO_INTERSECTS) {
          r = FunGeoIntersects(b, 0);
      } else if (t == FUN_GEO_LINE_STRING) {
          r = FunGeoLineString(b, 0);
      } else if (t == FUN_GEO_MULTI_LINE_STRING) {
          r = FunGeoMultiLineString(b, 0);
      } else if (t == FUN_GEO_MULTI_POINT) {
          r = FunGeoMultiPoint(b, 0);
      } else if (t == FUN_GEO_POINT) {
          r = FunGeoPoint(b, 0);
      } else if (t == FUN_GEO_POLYGON) {
          r = FunGeoPolygon(b, 0);
      } else if (t == FUN_HAS) {
          r = FunHas(b, 0);
      } else if (t == FUN_HASH) {
          r = FunHash(b, 0);
      } else if (t == FUN_INTER_SECTION) {
          r = FunInterSection(b, 0);
      } else if (t == FUN_IS_ARRAY) {
          r = FunIsArray(b, 0);
      } else if (t == FUN_IS_BOOL) {
          r = FunIsBool(b, 0);
      } else if (t == FUN_IS_DATE_STRING) {
          r = FunIsDateString(b, 0);
      } else if (t == FUN_IS_DOCUMENT) {
          r = FunIsDocument(b, 0);
      } else if (t == FUN_IS_KEY) {
          r = FunIsKey(b, 0);
      } else if (t == FUN_IS_LIST) {
          r = FunIsList(b, 0);
      } else if (t == FUN_IS_NULL) {
          r = FunIsNull(b, 0);
      } else if (t == FUN_IS_NUMBER) {
          r = FunIsNumber(b, 0);
      } else if (t == FUN_IS_OBJECT) {
          r = FunIsObject(b, 0);
      } else if (t == FUN_IS_SAME_COLLECTION) {
          r = FunIsSameCollection(b, 0);
      } else if (t == FUN_IS_STRING) {
          r = FunIsString(b, 0);
      } else if (t == FUN_JSON_PARSE) {
          r = FunJsonParse(b, 0);
      } else if (t == FUN_JSON_STRINGIFY) {
          r = FunJsonStringify(b, 0);
      } else if (t == FUN_KEEP) {
          r = FunKeep(b, 0);
      } else if (t == FUN_LAST) {
          r = FunLast(b, 0);
      } else if (t == FUN_LEFT) {
          r = FunLeft(b, 0);
      } else if (t == FUN_LENGTH) {
          r = FunLength(b, 0);
      } else if (t == FUN_LEVENSHTEIN_DISTANCE) {
          r = FunLevenshteinDistance(b, 0);
      } else if (t == FUN_LIKE) {
          r = FunLike(b, 0);
      } else if (t == FUN_LOG) {
      r = FunLog(b, 0);
      } else if (t == FUN_LOG_10) {
      r = FunLog10(b, 0);
      } else if (t == FUN_LOG_2) {
      r = FunLog2(b, 0);
      } else if (t == FUN_LOWER) {
          r = FunLower(b, 0);
      } else if (t == FUN_LTRIM) {
          r = FunLtrim(b, 0);
      } else if (t == FUN_MATCHES) {
          r = FunMatches(b, 0);
      } else if (t == FUN_MAX) {
      r = FunMax(b, 0);
      } else if (t == FUN_MD_5) {
          r = FunMd5(b, 0);
      } else if (t == FUN_MEDIAN) {
      r = FunMedian(b, 0);
      } else if (t == FUN_MERGE) {
          r = FunMerge(b, 0);
      } else if (t == FUN_MERGE_RECURSIVE) {
          r = FunMergeRecursive(b, 0);
      } else if (t == FUN_MIN) {
      r = FunMin(b, 0);
      } else if (t == FUN_MINUS) {
          r = FunMinus(b, 0);
      } else if (t == FUN_NTH) {
          r = FunNTH(b, 0);
      } else if (t == FUN_NOOPT) {
          r = FunNoopt(b, 0);
      } else if (t == FUN_NOT_NULL) {
          r = FunNotNull(b, 0);
      } else if (t == FUN_OUTER_SECTION) {
          r = FunOuterSection(b, 0);
      } else if (t == FUN_PARSE_IDENTIFIER) {
          r = FunParseIdentifier(b, 0);
      } else if (t == FUN_PASS_THRU) {
          r = FunPassThru(b, 0);
      } else if (t == FUN_PERCENTILE) {
      r = FunPercentile(b, 0);
      } else if (t == FUN_PI) {
      r = FunPi(b, 0);
      } else if (t == FUN_POP) {
          r = FunPop(b, 0);
      } else if (t == FUN_POSITION) {
          r = FunPosition(b, 0);
      } else if (t == FUN_POW) {
      r = FunPow(b, 0);
      } else if (t == FUN_PUSH) {
          r = FunPush(b, 0);
      } else if (t == FUN_RADIANS) {
      r = FunRadians(b, 0);
      } else if (t == FUN_RAND) {
      r = FunRand(b, 0);
      } else if (t == FUN_RANDOM_TOKEN) {
          r = FunRandomToken(b, 0);
      } else if (t == FUN_RANGE) {
      r = FunRange(b, 0);
      } else if (t == FUN_REGEX_MATCHES) {
          r = FunRegexMatches(b, 0);
      } else if (t == FUN_REGEX_REPLACE) {
          r = FunRegexReplace(b, 0);
      } else if (t == FUN_REGEX_SPLIT) {
          r = FunRegexSplit(b, 0);
      } else if (t == FUN_REGEX_TEST) {
          r = FunRegexTest(b, 0);
      } else if (t == FUN_REMOVE_NTH) {
          r = FunRemoveNTH(b, 0);
      } else if (t == FUN_REMOVE_VALUE) {
          r = FunRemoveValue(b, 0);
      } else if (t == FUN_REMOVE_VALUES) {
          r = FunRemoveValues(b, 0);
      } else if (t == FUN_REVERSE) {
          r = FunReverse(b, 0);
      } else if (t == FUN_RIGHT) {
          r = FunRight(b, 0);
      } else if (t == FUN_ROUND) {
      r = FunRound(b, 0);
      } else if (t == FUN_RTRIM) {
          r = FunRtrim(b, 0);
      } else if (t == FUN_SQRT) {
      r = FunSQRT(b, 0);
      } else if (t == FUN_SHA_1) {
          r = FunSha1(b, 0);
      } else if (t == FUN_SHA_512) {
          r = FunSha512(b, 0);
      } else if (t == FUN_SHIFT) {
          r = FunShift(b, 0);
      } else if (t == FUN_SIN) {
      r = FunSin(b, 0);
      } else if (t == FUN_SLEEP) {
          r = FunSleep(b, 0);
      } else if (t == FUN_SLICE) {
          r = FunSlice(b, 0);
      } else if (t == FUN_SORTED) {
          r = FunSorted(b, 0);
      } else if (t == FUN_SORTED_UNIQUE) {
          r = FunSortedUnique(b, 0);
      } else if (t == FUN_SOUNDEX) {
          r = FunSoundex(b, 0);
      } else if (t == FUN_SPLIT) {
          r = FunSplit(b, 0);
      } else if (t == FUN_STDDEV) {
      r = FunStddev(b, 0);
      } else if (t == FUN_STDDEV_POPULATION) {
      r = FunStddevPopulation(b, 0);
      } else if (t == FUN_SUBSTITUTE) {
          r = FunSubstitute(b, 0);
      } else if (t == FUN_SUBSTRING) {
          r = FunSubstring(b, 0);
      } else if (t == FUN_SUM) {
      r = FunSum(b, 0);
      } else if (t == FUN_TAN) {
      r = FunTan(b, 0);
      } else if (t == FUN_TAN_2) {
      r = FunTan2(b, 0);
      } else if (t == FUN_TO_ARRAY) {
          r = FunToArray(b, 0);
      } else if (t == FUN_TO_BASE_64) {
          r = FunToBase64(b, 0);
      } else if (t == FUN_TO_BOOL) {
          r = FunToBool(b, 0);
      } else if (t == FUN_TO_HEX) {
          r = FunToHex(b, 0);
      } else if (t == FUN_TO_LIST) {
          r = FunToList(b, 0);
      } else if (t == FUN_TO_NUMBER) {
          r = FunToNumber(b, 0);
      } else if (t == FUN_TO_STRING) {
          r = FunToString(b, 0);
      } else if (t == FUN_TOKENS) {
          r = FunTokens(b, 0);
      } else if (t == FUN_TRANSLATE) {
          r = FunTranslate(b, 0);
      } else if (t == FUN_TRIM) {
          r = FunTrim(b, 0);
      } else if (t == FUN_TYPENAME) {
          r = FunTypename(b, 0);
      } else if (t == FUN_UN_SHIFT) {
          r = FunUnShift(b, 0);
      } else if (t == FUN_UNION) {
          r = FunUnion(b, 0);
      } else if (t == FUN_UNION_DISTINCT) {
          r = FunUnionDistinct(b, 0);
      } else if (t == FUN_UNIQUE) {
          r = FunUnique(b, 0);
      } else if (t == FUN_UNSET) {
          r = FunUnset(b, 0);
      } else if (t == FUN_UNSET_RECURSIVE) {
          r = FunUnsetRecursive(b, 0);
      } else if (t == FUN_UPPER) {
          r = FunUpper(b, 0);
      } else if (t == FUN_UUID) {
          r = FunUuid(b, 0);
      } else if (t == FUN_V_8) {
          r = FunV8(b, 0);
      } else if (t == FUN_VALUES) {
          r = FunValues(b, 0);
      } else if (t == FUN_VARIANCE) {
      r = FunVariance(b, 0);
      } else if (t == FUN_VARIANCE_POPULATION) {
      r = FunVariancePopulation(b, 0);
      } else if (t == FUN_VARIANCE_SAMPLE) {
      r = FunVarianceSample(b, 0);
      } else if (t == FUN_VERSION) {
          r = FunVersion(b, 0);
      } else if (t == FUN_WARN) {
          r = FunWarn(b, 0);
      } else if (t == FUN_ZIP) {
          r = FunZip(b, 0);
      } else if (t == FUNCTION_EXPRESSION) {
      r = FunctionExpression(b, 0);
      } else if (t == INTEGER_TYPE) {
      r = IntegerType(b, 0);
      } else if (t == JSON_TYPE) {
      r = JsonType(b, 0);
      } else if (t == KEYWORD_FUNCTIONS) {
      r = KeywordFunctions(b, 0);
      } else if (t == KEYWORD_STATEMENTS) {
      r = KeywordStatements(b, 0);
      } else if (t == LINE_COMMENT) {
      r = LineComment(b, 0);
      } else if (t == NAMED_FUNCTIONS) {
      r = NamedFunctions(b, 0);
      } else if (t == NAMED_KEYWORD_FUNCTIONS) {
      r = NamedKeywordFunctions(b, 0);
      } else if (t == NAMED_KEYWORD_STATEMENTS) {
      r = NamedKeywordStatements(b, 0);
      } else if (t == NUMBER_TYPE) {
      r = NumberType(b, 0);
      } else if (t == OBJECT_EXPRESSION) {
      r = ObjectExpression(b, 0);
      } else if (t == OPERATOR_STATEMENTS) {
      r = OperatorStatements(b, 0);
      } else if (t == PARAMETER_VARIABLE) {
      r = ParameterVariable(b, 0);
      } else if (t == PROPERTY_LOOKUP) {
      r = PropertyLookup(b, 0);
      } else if (t == PROPERTY_NAME) {
      r = PropertyName(b, 0);
      } else if (t == QUERY_ITEM) {
      r = QueryItem(b, 0);
      } else if (t == RESERVED_WORDS) {
      r = ReservedWords(b, 0);
      } else if (t == SEQUENCE) {
      r = Sequence(b, 0);
      } else if (t == SIGNED_INTEGER) {
      r = SignedInteger(b, 0);
      } else if (t == STATEMENT) {
      r = Statement(b, 0);
      } else if (t == STRING_TYPE) {
      r = StringType(b, 0);
      } else if (t == SYSTEM_PROPERTY) {
      r = SystemProperty(b, 0);
      } else if (t == VARIABLE_PLACE_HOLDER) {
      r = VariablePlaceHolder(b, 0);
      } else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return aql(b, l + 1);
  }

    /* ********************************************************** */
    // A_IDENTITY
    //                  |A_TEXT_DE
    //                  |A_TEXT_EN
    //                  |A_TEXT_ES
    //                  |A_TEXT_FI
    //                  |A_TEXT_FR
    //                  |A_TEXT_IT
    //                  |A_TEXT_NL
    //                  |A_TEXT_NO
    //                  |A_TEXT_PT
    //                  |A_TEXT_RU
    //                  |A_TEXT_SV
    //                  |A_TEXT_ZH
    public static boolean AnalyzerType(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AnalyzerType")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, ANALYZER_TYPE, "<analyzer type>");
        r = consumeToken(b, A_IDENTITY);
        if (!r) r = consumeToken(b, A_TEXT_DE);
        if (!r) r = consumeToken(b, A_TEXT_EN);
        if (!r) r = consumeToken(b, A_TEXT_ES);
        if (!r) r = consumeToken(b, A_TEXT_FI);
        if (!r) r = consumeToken(b, A_TEXT_FR);
        if (!r) r = consumeToken(b, A_TEXT_IT);
        if (!r) r = consumeToken(b, A_TEXT_NL);
        if (!r) r = consumeToken(b, A_TEXT_NO);
        if (!r) r = consumeToken(b, A_TEXT_PT);
        if (!r) r = consumeToken(b, A_TEXT_RU);
        if (!r) r = consumeToken(b, A_TEXT_SV);
        if (!r) r = consumeToken(b, A_TEXT_ZH);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

  /* ********************************************************** */
  // NUMBER | (T_PLUS | T_MINUS) NUMBER
  public static boolean AnyNumber(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "AnyNumber")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY_NUMBER, "<any number>");
    r = consumeToken(b, NUMBER);
      if (!r) r = AnyNumber_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (T_PLUS | T_MINUS) NUMBER
  private static boolean AnyNumber_1(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "AnyNumber_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyNumber_1_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // T_PLUS | T_MINUS
  private static boolean AnyNumber_1_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "AnyNumber_1_0")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
      if (!r) r = consumeToken(b, T_MINUS);
      return r;
  }

    /* ********************************************************** */
    // ExpressionType | JsonType
    public static boolean AnyType(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AnyType")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, ANY_TYPE, "<any type>");
        r = ExpressionType(b, l + 1);
        if (!r) r = JsonType(b, l + 1);
        exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_PLUS
  //                     | T_MINUS
  //                     | T_TIMES
  //                     | T_DIV
  //                     | T_MOD
  static boolean ArithmeticOperators(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ArithmeticOperators")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
      if (!r) r = consumeToken(b, T_MINUS);
      if (!r) r = consumeToken(b, T_TIMES);
      if (!r) r = consumeToken(b, T_DIV);
      if (!r) r = consumeToken(b, T_MOD);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression "[" ExpressionType "]"
  public static boolean ArrayRef(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ArrayRef")) return false;
      if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
      r = ObjectExpression(b, l + 1);
      r = r && consumeToken(b, T_ARRAY_OPEN);
      r = r && ExpressionType(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
      exit_section_(b, m, ARRAY_REF, r);
    return r;
  }

    /* ********************************************************** */
    // '[' array_element* ']'
    public static boolean ArrayType(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ArrayType")) return false;
        if (!nextTokenIs(b, T_ARRAY_OPEN)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, ARRAY_TYPE, null);
        r = consumeToken(b, T_ARRAY_OPEN);
        p = r; // pin = 1
        r = r && report_error_(b, ArrayType_1(b, l + 1));
        r = p && consumeToken(b, T_ARRAY_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // array_element*
  private static boolean ArrayType_1(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ArrayType_1")) return false;
    while (true) {
      int c = current_position_(b);
        if (!array_element(b, l + 1)) break;
        if (!empty_element_parsed_guard_(b, "ArrayType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // B_COMMENT
  public static boolean BlockComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockComment")) return false;
    if (!nextTokenIs(b, B_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, B_COMMENT);
    exit_section_(b, m, BLOCK_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // T_TRUE | T_FALSE
  public static boolean BooleanType(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "BooleanType")) return false;
      if (!nextTokenIs(b, "<boolean type>", T_FALSE, T_TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_TYPE, "<boolean type>");
    r = consumeToken(b, T_TRUE);
      if (!r) r = consumeToken(b, T_FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LineComment | BlockComment
  public static boolean Comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Comment")) return false;
    if (!nextTokenIs(b, "<comment>", B_COMMENT, L_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = LineComment(b, l + 1);
    if (!r) r = BlockComment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NumberType |ArrayRef
  // | ObjectExpression
  // | ParameterVariable
  // | VariablePlaceHolder
  // | ExpressionArray
  // | ArrayType
  // | StringType
  // | NamedKeywordStatements
  // | NamedFunctions
  // | BooleanType
  // | ExpressionType
  // | JsonType
  public static boolean ComplexJsonValue(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ComplexJsonValue")) return false;
    boolean r;
      Marker m = enter_section_(b, l, _NONE_, COMPLEX_JSON_VALUE, "<complex json value>");
      r = NumberType(b, l + 1);
      if (!r) r = ArrayRef(b, l + 1);
      if (!r) r = ObjectExpression(b, l + 1);
      if (!r) r = ParameterVariable(b, l + 1);
      if (!r) r = VariablePlaceHolder(b, l + 1);
      if (!r) r = ExpressionArray(b, l + 1);
      if (!r) r = ArrayType(b, l + 1);
      if (!r) r = StringType(b, l + 1);
      if (!r) r = NamedKeywordStatements(b, l + 1);
      if (!r) r = NamedFunctions(b, l + 1);
      if (!r) r = BooleanType(b, l + 1);
      if (!r) r = ExpressionType(b, l + 1);
      if (!r) r = JsonType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ExpressionType (',' ExpressionType)*
  static boolean ExpressionArray(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ExpressionArray")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionType(b, l + 1);
    r = r && ExpressionArray_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' ExpressionType)*
  private static boolean ExpressionArray_1(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ExpressionArray_1")) return false;
    while (true) {
      int c = current_position_(b);
        if (!ExpressionArray_1_0(b, l + 1)) break;
        if (!empty_element_parsed_guard_(b, "ExpressionArray_1", c)) break;
    }
    return true;
  }

  // ',' ExpressionType
  private static boolean ExpressionArray_1_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ExpressionArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && ExpressionType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ArrayRef | ObjectExpression
  //                 | NumberType
  //                 | ArrayType
  //                 | StringType
  //                 | BooleanType
  //                 | VariablePlaceHolder
  //                 | FunctionExpression
  //                 | ParameterVariable
  //                 | SystemProperty
  //                 | ArithmeticOperators
  //                 | ReservedWords
  //                 | PropertyName
  public static boolean ExpressionType(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ExpressionType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_TYPE, "<expression type>");
      r = ArrayRef(b, l + 1);
      if (!r) r = ObjectExpression(b, l + 1);
      if (!r) r = NumberType(b, l + 1);
      if (!r) r = ArrayType(b, l + 1);
      if (!r) r = StringType(b, l + 1);
      if (!r) r = BooleanType(b, l + 1);
      if (!r) r = VariablePlaceHolder(b, l + 1);
      if (!r) r = FunctionExpression(b, l + 1);
      if (!r) r = ParameterVariable(b, l + 1);
      if (!r) r = SystemProperty(b, l + 1);
      if (!r) r = ArithmeticOperators(b, l + 1);
      if (!r) r = ReservedWords(b, l + 1);
      if (!r) r = PropertyName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // F_ABS "(" number_argument ")"
  public static boolean FunAbs(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAbs")) return false;
      if (!nextTokenIs(b, F_ABS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ABS, null);
      r = consumeTokens(b, 2, F_ABS, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ACOS "(" number_argument ")"
  public static boolean FunAcos(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAcos")) return false;
      if (!nextTokenIs(b, F_ACOS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ACOS, null);
      r = consumeTokens(b, 2, F_ACOS, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_APPEND  "(" number_argument_array "," ExpressionType ("," boolean_argument)? ")"
    public static boolean FunAppend(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAppend")) return false;
        if (!nextTokenIs(b, F_APPEND)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_APPEND, null);
        r = consumeTokens(b, 2, F_APPEND, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ExpressionType(b, l + 1)) && r;
        r = p && report_error_(b, FunAppend_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunAppend_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAppend_5")) return false;
        FunAppend_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunAppend_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAppend_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_APPLY "(" StringType ("," ArrayType)? ")"
    public static boolean FunApply(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunApply")) return false;
        if (!nextTokenIs(b, F_APPLY)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_APPLY, null);
        r = consumeTokens(b, 2, F_APPLY, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, StringType(b, l + 1));
        r = p && report_error_(b, FunApply_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," ArrayType)?
    private static boolean FunApply_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunApply_3")) return false;
        FunApply_3_0(b, l + 1);
        return true;
    }

    // "," ArrayType
    private static boolean FunApply_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunApply_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && ArrayType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_ASIN "(" number_argument ")"
  public static boolean FunAsin(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAsin")) return false;
      if (!nextTokenIs(b, F_ASIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ASIN, null);
      r = consumeTokens(b, 2, F_ASIN, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_ASSERT "(" AnyType "," StringType  ")"
    public static boolean FunAssert(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAssert")) return false;
        if (!nextTokenIs(b, F_ASSERT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_ASSERT, null);
        r = consumeTokens(b, 2, F_ASSERT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, StringType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_ATAN "(" number_argument ")"
  public static boolean FunAtan(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAtan")) return false;
      if (!nextTokenIs(b, F_ATAN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ATAN, null);
      r = consumeTokens(b, 2, F_ATAN, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_ATAN2 "(" number_argument ")"
  public static boolean FunAtan2(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAtan2")) return false;
      if (!nextTokenIs(b, F_ATAN2)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ATAN_2, null);
      r = consumeTokens(b, 2, F_ATAN2, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_ATTRIBUTES  "(" document_argument ("," boolean_argument)? ("," boolean_argument)? ")"
    public static boolean FunAttributes(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAttributes")) return false;
        if (!nextTokenIs(b, F_ATTRIBUTES)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_ATTRIBUTES, null);
        r = consumeTokens(b, 2, F_ATTRIBUTES, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, document_argument(b, l + 1));
        r = p && report_error_(b, FunAttributes_3(b, l + 1)) && r;
        r = p && report_error_(b, FunAttributes_4(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunAttributes_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAttributes_3")) return false;
        FunAttributes_3_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunAttributes_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAttributes_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," boolean_argument)?
    private static boolean FunAttributes_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAttributes_4")) return false;
        FunAttributes_4_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunAttributes_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunAttributes_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_AVERAGE  "(" number_argument_array ")"
  public static boolean FunAverage(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAverage")) return false;
      if (!nextTokenIs(b, F_AVERAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_AVERAGE, null);
      r = consumeTokens(b, 2, F_AVERAGE, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_AVG "(" number_argument_array ")"
  public static boolean FunAvg(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunAvg")) return false;
      if (!nextTokenIs(b, F_AVG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_AVG, null);
      r = consumeTokens(b, 2, F_AVG, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_CALL "(" StringType ("," AnyType)* ")"
    public static boolean FunCall(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCall")) return false;
        if (!nextTokenIs(b, F_CALL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_CALL, null);
        r = consumeTokens(b, 2, F_CALL, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, StringType(b, l + 1));
        r = p && report_error_(b, FunCall_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," AnyType)*
    private static boolean FunCall_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCall_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunCall_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunCall_3", c)) break;
        }
        return true;
    }

    // "," AnyType
    private static boolean FunCall_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCall_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && AnyType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_CEIL  "(" number_argument ")"
  public static boolean FunCeil(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunCeil")) return false;
      if (!nextTokenIs(b, F_CEIL)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CEIL, null);
      r = consumeTokens(b, 2, F_CEIL, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_CHAR_LENGTH "(" AnyType ")"
    public static boolean FunCharLength(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCharLength")) return false;
        if (!nextTokenIs(b, F_CHAR_LENGTH)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_CHAR_LENGTH, null);
        r = consumeTokens(b, 2, F_CHAR_LENGTH, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_COLLECTION_COUNT "(" number_argument_array ")"
    public static boolean FunCollectionCount(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCollectionCount")) return false;
        if (!nextTokenIs(b, F_COLLECTION_COUNT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_COLLECTION_COUNT, null);
        r = consumeTokens(b, 2, F_COLLECTION_COUNT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_COLLECTIONS "(" ")"
    public static boolean FunCollections(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCollections")) return false;
        if (!nextTokenIs(b, F_COLLECTIONS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_COLLECTIONS, null);
        r = consumeTokens(b, 2, F_COLLECTIONS, T_OPEN, T_CLOSE);
        p = r; // pin = 2
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_CONCAT "(" AnyType+ ")"
    public static boolean FunConcat(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunConcat")) return false;
        if (!nextTokenIs(b, F_CONCAT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_CONCAT, null);
        r = consumeTokens(b, 2, F_CONCAT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunConcat_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // AnyType+
    private static boolean FunConcat_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunConcat_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = AnyType(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!AnyType(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunConcat_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_CONCAT_SEPARATOR "(" string_argument "," ExpressionArray+ ")"
  public static boolean FunConcatSeparator(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunConcatSeparator")) return false;
      if (!nextTokenIs(b, F_CONCAT_SEPARATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_CONCAT_SEPARATOR, null);
      r = consumeTokens(b, 2, F_CONCAT_SEPARATOR, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, string_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, FunConcatSeparator_4(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpressionArray+
  private static boolean FunConcatSeparator_4(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunConcatSeparator_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExpressionArray(b, l + 1);
    while (r) {
      int c = current_position_(b);
        if (!ExpressionArray(b, l + 1)) break;
        if (!empty_element_parsed_guard_(b, "FunConcatSeparator_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

    /* ********************************************************** */
    // F_CONTAINS "(" string_argument "," string_argument ("," boolean_argument)? ")"
    public static boolean FunContains(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunContains")) return false;
        if (!nextTokenIs(b, F_CONTAINS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_CONTAINS, null);
        r = consumeTokens(b, 2, F_CONTAINS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunContains_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunContains_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunContains_5")) return false;
        FunContains_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunContains_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunContains_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_CONTAINS_ARRAY  "(" number_argument_array "," ExpressionType ("," boolean_argument)? ")"
    public static boolean FunContainsArray(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunContainsArray")) return false;
        if (!nextTokenIs(b, F_CONTAINS_ARRAY)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_CONTAINS_ARRAY, null);
        r = consumeTokens(b, 2, F_CONTAINS_ARRAY, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ExpressionType(b, l + 1)) && r;
        r = p && report_error_(b, FunContainsArray_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunContainsArray_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunContainsArray_5")) return false;
        FunContainsArray_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunContainsArray_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunContainsArray_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_COS "(" number_argument ")"
  public static boolean FunCos(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunCos")) return false;
      if (!nextTokenIs(b, F_COS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_COS, null);
      r = consumeTokens(b, 2, F_COS, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_COUNT  "(" number_argument_array ")"
    public static boolean FunCount(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCount")) return false;
        if (!nextTokenIs(b, F_COUNT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_COUNT, null);
        r = consumeTokens(b, 2, F_COUNT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_COUNT_DISTINCT  "(" number_argument_array ")"
    public static boolean FunCountDistinct(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCountDistinct")) return false;
        if (!nextTokenIs(b, F_COUNT_DISTINCT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_COUNT_DISTINCT, null);
        r = consumeTokens(b, 2, F_COUNT_DISTINCT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_COUNT_UNIQUE  "(" number_argument_array ")"
    public static boolean FunCountUnique(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCountUnique")) return false;
        if (!nextTokenIs(b, F_COUNT_UNIQUE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_COUNT_UNIQUE, null);
        r = consumeTokens(b, 2, F_COUNT_UNIQUE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_CURRENT_USER "(" ")"
    public static boolean FunCurrentUser(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunCurrentUser")) return false;
        if (!nextTokenIs(b, F_CURRENT_USER)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_CURRENT_USER, null);
        r = consumeTokens(b, 2, F_CURRENT_USER, T_OPEN, T_CLOSE);
        p = r; // pin = 2
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_DEGREES  "(" number_argument ")"
  public static boolean FunDegrees(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunDegrees")) return false;
      if (!nextTokenIs(b, F_DEGREES)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_DEGREES, null);
      r = consumeTokens(b, 2, F_DEGREES, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_DISTANCE "(" NumberType "," NumberType "," NumberType "," NumberType ")"
    public static boolean FunDistance(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunDistance")) return false;
        if (!nextTokenIs(b, F_DISTANCE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_DISTANCE, null);
        r = consumeTokens(b, 2, F_DISTANCE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, NumberType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, NumberType(b, l + 1)) && r;
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, NumberType(b, l + 1)) && r;
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, NumberType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_DOCUMENT "(" property_name "," StringType | ArrayType ")"
    public static boolean FunDocument(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunDocument")) return false;
        if (!nextTokenIs(b, "<fun document>", F_DOCUMENT, T_ARRAY_OPEN)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_DOCUMENT, "<fun document>");
        r = FunDocument_0(b, l + 1);
        if (!r) r = FunDocument_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_DOCUMENT "(" property_name "," StringType
    private static boolean FunDocument_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunDocument_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_DOCUMENT, T_OPEN);
        r = r && property_name(b, l + 1);
        r = r && consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ArrayType ")"
    private static boolean FunDocument_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunDocument_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ArrayType(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_ENCODE_URI_COMPONENT "(" string_argument ")"
    public static boolean FunEncodeUriComponent(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunEncodeUriComponent")) return false;
        if (!nextTokenIs(b, F_ENCODE_URI_COMPONENT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_ENCODE_URI_COMPONENT, null);
        r = consumeTokens(b, 2, F_ENCODE_URI_COMPONENT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_EXP  "(" number_argument ")"
  public static boolean FunExp(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunExp")) return false;
      if (!nextTokenIs(b, F_EXP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_EXP, null);
      r = consumeTokens(b, 2, F_EXP, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_EXP2  "(" number_argument ")"
  public static boolean FunExp2(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunExp2")) return false;
      if (!nextTokenIs(b, F_EXP2)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_EXP_2, null);
      r = consumeTokens(b, 2, F_EXP2, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_FAIL "(" StringType ")"
    public static boolean FunFail(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFail")) return false;
        if (!nextTokenIs(b, F_FAIL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FAIL, null);
        r = consumeTokens(b, 2, F_FAIL, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, StringType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_FIND_FIRST "(" string_argument "," string_argument ("," integer_argument)* ")"
    public static boolean FunFindFirst(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFindFirst")) return false;
        if (!nextTokenIs(b, F_FIND_FIRST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FIND_FIRST, null);
        r = consumeTokens(b, 2, F_FIND_FIRST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunFindFirst_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," integer_argument)*
    private static boolean FunFindFirst_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFindFirst_5")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunFindFirst_5_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunFindFirst_5", c)) break;
        }
        return true;
    }

    // "," integer_argument
    private static boolean FunFindFirst_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFindFirst_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_FIND_LAST "(" string_argument "," string_argument ("," integer_argument)* ")"
    public static boolean FunFindLast(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFindLast")) return false;
        if (!nextTokenIs(b, F_FIND_LAST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FIND_LAST, null);
        r = consumeTokens(b, 2, F_FIND_LAST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunFindLast_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," integer_argument)*
    private static boolean FunFindLast_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFindLast_5")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunFindLast_5_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunFindLast_5", c)) break;
        }
        return true;
    }

    // "," integer_argument
    private static boolean FunFindLast_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFindLast_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_FIRST  "(" number_argument_array ")"
    public static boolean FunFirst(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirst")) return false;
        if (!nextTokenIs(b, F_FIRST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FIRST, null);
        r = consumeTokens(b, 2, F_FIRST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_FIRST_DOCUMENT "(" AnyType ("," AnyType)* ")"
    public static boolean FunFirstDocument(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirstDocument")) return false;
        if (!nextTokenIs(b, F_FIRST_DOCUMENT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FIRST_DOCUMENT, null);
        r = consumeTokens(b, 2, F_FIRST_DOCUMENT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && report_error_(b, FunFirstDocument_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," AnyType)*
    private static boolean FunFirstDocument_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirstDocument_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunFirstDocument_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunFirstDocument_3", c)) break;
        }
        return true;
    }

    // "," AnyType
    private static boolean FunFirstDocument_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirstDocument_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && AnyType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_FIRST_LIST "(" AnyType ("," AnyType)* ")"
    public static boolean FunFirstList(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirstList")) return false;
        if (!nextTokenIs(b, F_FIRST_LIST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FIRST_LIST, null);
        r = consumeTokens(b, 2, F_FIRST_LIST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && report_error_(b, FunFirstList_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," AnyType)*
    private static boolean FunFirstList_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirstList_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunFirstList_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunFirstList_3", c)) break;
        }
        return true;
    }

    // "," AnyType
    private static boolean FunFirstList_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFirstList_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && AnyType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_FLATTEN  "(" number_argument_array ("," IntegerType)? ")"
    public static boolean FunFlatten(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFlatten")) return false;
        if (!nextTokenIs(b, F_FLATTEN)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FLATTEN, null);
        r = consumeTokens(b, 2, F_FLATTEN, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, FunFlatten_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," IntegerType)?
    private static boolean FunFlatten_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFlatten_3")) return false;
        FunFlatten_3_0(b, l + 1);
        return true;
    }

    // "," IntegerType
    private static boolean FunFlatten_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFlatten_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && IntegerType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_FLOOR  "(" number_argument ")"
  public static boolean FunFloor(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunFloor")) return false;
      if (!nextTokenIs(b, F_FLOOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_FLOOR, null);
      r = consumeTokens(b, 2, F_FLOOR, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_FULLTEXT "(" possible_array "," StringType  "," StringType  ("," IntegerType)? ")"
    public static boolean FunFullText(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFullText")) return false;
        if (!nextTokenIs(b, F_FULLTEXT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_FULL_TEXT, null);
        r = consumeTokens(b, 2, F_FULLTEXT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, possible_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, StringType(b, l + 1)) && r;
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, StringType(b, l + 1)) && r;
        r = p && report_error_(b, FunFullText_7(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," IntegerType)?
    private static boolean FunFullText_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFullText_7")) return false;
        FunFullText_7_0(b, l + 1);
        return true;
    }

    // "," IntegerType
    private static boolean FunFullText_7_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunFullText_7_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && IntegerType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_GEO_CONTAINS "(" JsonType "," JsonType ")"
    public static boolean FunGeoContains(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoContains")) return false;
        if (!nextTokenIs(b, F_GEO_CONTAINS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_CONTAINS, null);
        r = consumeTokens(b, 2, F_GEO_CONTAINS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, JsonType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, JsonType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_GEO_DISTANCE"(" JsonType "," JsonType ")"
    public static boolean FunGeoDistance(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoDistance")) return false;
        if (!nextTokenIs(b, F_GEO_DISTANCE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_DISTANCE, null);
        r = consumeTokens(b, 2, F_GEO_DISTANCE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, JsonType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, JsonType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_GEO_EQUALS"(" JsonType "," JsonType ")"
    public static boolean FunGeoEquals(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoEquals")) return false;
        if (!nextTokenIs(b, F_GEO_EQUALS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_EQUALS, null);
        r = consumeTokens(b, 2, F_GEO_EQUALS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, JsonType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, JsonType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_GEO_INTERSECTS"(" JsonType "," JsonType ")"
    public static boolean FunGeoIntersects(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoIntersects")) return false;
        if (!nextTokenIs(b, F_GEO_INTERSECTS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_INTERSECTS, null);
        r = consumeTokens(b, 2, F_GEO_INTERSECTS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, JsonType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, JsonType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_GEO_LINESTRING "(" ArrayType ("," ArrayType)* ")"
    public static boolean FunGeoLineString(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoLineString")) return false;
        if (!nextTokenIs(b, F_GEO_LINESTRING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_LINE_STRING, null);
        r = consumeTokens(b, 2, F_GEO_LINESTRING, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, ArrayType(b, l + 1));
        r = p && report_error_(b, FunGeoLineString_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," ArrayType)*
    private static boolean FunGeoLineString_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoLineString_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunGeoLineString_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunGeoLineString_3", c)) break;
        }
        return true;
    }

    // "," ArrayType
    private static boolean FunGeoLineString_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoLineString_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && ArrayType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_GEO_MULTILINESTRING "(" ArrayType ("," ArrayType)* ")"
    public static boolean FunGeoMultiLineString(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoMultiLineString")) return false;
        if (!nextTokenIs(b, F_GEO_MULTILINESTRING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_MULTI_LINE_STRING, null);
        r = consumeTokens(b, 2, F_GEO_MULTILINESTRING, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, ArrayType(b, l + 1));
        r = p && report_error_(b, FunGeoMultiLineString_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," ArrayType)*
    private static boolean FunGeoMultiLineString_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoMultiLineString_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunGeoMultiLineString_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunGeoMultiLineString_3", c)) break;
        }
        return true;
    }

    // "," ArrayType
    private static boolean FunGeoMultiLineString_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoMultiLineString_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && ArrayType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_GEO_MULTIPOINT "(" ArrayType ("," ArrayType)* ")"
    public static boolean FunGeoMultiPoint(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoMultiPoint")) return false;
        if (!nextTokenIs(b, F_GEO_MULTIPOINT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_MULTI_POINT, null);
        r = consumeTokens(b, 2, F_GEO_MULTIPOINT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, ArrayType(b, l + 1));
        r = p && report_error_(b, FunGeoMultiPoint_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," ArrayType)*
    private static boolean FunGeoMultiPoint_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoMultiPoint_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunGeoMultiPoint_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunGeoMultiPoint_3", c)) break;
        }
        return true;
    }

    // "," ArrayType
    private static boolean FunGeoMultiPoint_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoMultiPoint_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && ArrayType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_GEO_POINT "(" NumberType "," NumberType ")"
    public static boolean FunGeoPoint(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoPoint")) return false;
        if (!nextTokenIs(b, F_GEO_POINT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_POINT, null);
        r = consumeTokens(b, 2, F_GEO_POINT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, NumberType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, NumberType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_GEO_POLYGON "(" ArrayType ("," ArrayType)* ")"
    public static boolean FunGeoPolygon(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoPolygon")) return false;
        if (!nextTokenIs(b, F_GEO_POLYGON)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_GEO_POLYGON, null);
        r = consumeTokens(b, 2, F_GEO_POLYGON, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, ArrayType(b, l + 1));
        r = p && report_error_(b, FunGeoPolygon_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," ArrayType)*
    private static boolean FunGeoPolygon_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoPolygon_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunGeoPolygon_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunGeoPolygon_3", c)) break;
        }
        return true;
    }

    // "," ArrayType
    private static boolean FunGeoPolygon_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunGeoPolygon_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && ArrayType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_HAS  "(" document_argument ("," StringType)? ")"
    public static boolean FunHas(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunHas")) return false;
        if (!nextTokenIs(b, F_HAS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_HAS, null);
        r = consumeTokens(b, 2, F_HAS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, document_argument(b, l + 1));
        r = p && report_error_(b, FunHas_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," StringType)?
    private static boolean FunHas_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunHas_3")) return false;
        FunHas_3_0(b, l + 1);
        return true;
    }

    // "," StringType
    private static boolean FunHas_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunHas_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_HASH "(" AnyType ")"
    public static boolean FunHash(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunHash")) return false;
        if (!nextTokenIs(b, F_HASH)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_HASH, null);
        r = consumeTokens(b, 2, F_HASH, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_INTERSECTION  "(" (number_argument_array)+ ")"
    public static boolean FunInterSection(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunInterSection")) return false;
        if (!nextTokenIs(b, F_INTERSECTION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_INTER_SECTION, null);
        r = consumeTokens(b, 2, F_INTERSECTION, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunInterSection_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)+
    private static boolean FunInterSection_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunInterSection_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunInterSection_2_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunInterSection_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunInterSection_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunInterSection_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunInterSection_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_IS_ARRAY "(" AnyType ")"
    public static boolean FunIsArray(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsArray")) return false;
        if (!nextTokenIs(b, F_IS_ARRAY)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_ARRAY, null);
        r = consumeTokens(b, 2, F_IS_ARRAY, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_BOOL "(" AnyType ")"
    public static boolean FunIsBool(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsBool")) return false;
        if (!nextTokenIs(b, F_IS_BOOL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_BOOL, null);
        r = consumeTokens(b, 2, F_IS_BOOL, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_DATESTRING "(" AnyType ")"
    public static boolean FunIsDateString(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsDateString")) return false;
        if (!nextTokenIs(b, F_IS_DATESTRING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_DATE_STRING, null);
        r = consumeTokens(b, 2, F_IS_DATESTRING, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_DOCUMENT "(" AnyType ")"
    public static boolean FunIsDocument(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsDocument")) return false;
        if (!nextTokenIs(b, F_IS_DOCUMENT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_DOCUMENT, null);
        r = consumeTokens(b, 2, F_IS_DOCUMENT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_KEY "(" AnyType ")"
    public static boolean FunIsKey(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsKey")) return false;
        if (!nextTokenIs(b, F_IS_KEY)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_KEY, null);
        r = consumeTokens(b, 2, F_IS_KEY, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_LIST "(" AnyType ")"
    public static boolean FunIsList(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsList")) return false;
        if (!nextTokenIs(b, F_IS_LIST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_LIST, null);
        r = consumeTokens(b, 2, F_IS_LIST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_NULL "(" AnyType ")"
    public static boolean FunIsNull(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsNull")) return false;
        if (!nextTokenIs(b, F_IS_NULL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_NULL, null);
        r = consumeTokens(b, 2, F_IS_NULL, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_NUMBER "(" AnyType ")"
    public static boolean FunIsNumber(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsNumber")) return false;
        if (!nextTokenIs(b, F_IS_NUMBER)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_NUMBER, null);
        r = consumeTokens(b, 2, F_IS_NUMBER, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_OBJECT "(" AnyType ")"
    public static boolean FunIsObject(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsObject")) return false;
        if (!nextTokenIs(b, F_IS_OBJECT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_OBJECT, null);
        r = consumeTokens(b, 2, F_IS_OBJECT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_IS_SAME_COLLECTION  "(" StringType ("," document_argument )? ")"
    public static boolean FunIsSameCollection(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsSameCollection")) return false;
        if (!nextTokenIs(b, F_IS_SAME_COLLECTION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_SAME_COLLECTION, null);
        r = consumeTokens(b, 2, F_IS_SAME_COLLECTION, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, StringType(b, l + 1));
        r = p && report_error_(b, FunIsSameCollection_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," document_argument )?
    private static boolean FunIsSameCollection_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsSameCollection_3")) return false;
        FunIsSameCollection_3_0(b, l + 1);
        return true;
    }

    // "," document_argument
    private static boolean FunIsSameCollection_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsSameCollection_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && document_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_IS_STRING "(" AnyType ")"
    public static boolean FunIsString(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunIsString")) return false;
        if (!nextTokenIs(b, F_IS_STRING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_IS_STRING, null);
        r = consumeTokens(b, 2, F_IS_STRING, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_JSON_PARSE "(" string_argument ")"
    public static boolean FunJsonParse(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunJsonParse")) return false;
        if (!nextTokenIs(b, F_JSON_PARSE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_JSON_PARSE, null);
        r = consumeTokens(b, 2, F_JSON_PARSE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_JSON_STRINGIFY "(" AnyType ")"
    public static boolean FunJsonStringify(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunJsonStringify")) return false;
        if (!nextTokenIs(b, F_JSON_STRINGIFY)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_JSON_STRINGIFY, null);
        r = consumeTokens(b, 2, F_JSON_STRINGIFY, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_KEEP  "(" document_argument "," (string_list | string_argument_array | possible_array )  ")"
    public static boolean FunKeep(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunKeep")) return false;
        if (!nextTokenIs(b, F_KEEP)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_KEEP, null);
        r = consumeTokens(b, 2, F_KEEP, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, document_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, FunKeep_4(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // string_list | string_argument_array | possible_array
    private static boolean FunKeep_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunKeep_4")) return false;
        boolean r;
        r = string_list(b, l + 1);
        if (!r) r = string_argument_array(b, l + 1);
        if (!r) r = possible_array(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // F_LAST  "(" number_argument_array ")"
    public static boolean FunLast(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLast")) return false;
        if (!nextTokenIs(b, F_LAST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_LAST, null);
        r = consumeTokens(b, 2, F_LAST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_LEFT "(" string_argument "," integer_argument ")"
    public static boolean FunLeft(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLeft")) return false;
        if (!nextTokenIs(b, F_LEFT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_LEFT, null);
        r = consumeTokens(b, 2, F_LEFT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, integer_argument(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_LENGTH  "(" number_argument_array | document_argument | string_argument ")"
    public static boolean FunLength(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLength")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_LENGTH, "<fun length>");
        r = FunLength_0(b, l + 1);
        if (!r) r = document_argument(b, l + 1);
        if (!r) r = FunLength_2(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_LENGTH  "(" number_argument_array
    private static boolean FunLength_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLength_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_LENGTH, T_OPEN);
        r = r && number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // string_argument ")"
    private static boolean FunLength_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLength_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = string_argument(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_LEVENSHTEIN_DISTANCE "(" string_argument "," string_argument ")"
    public static boolean FunLevenshteinDistance(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLevenshteinDistance")) return false;
        if (!nextTokenIs(b, F_LEVENSHTEIN_DISTANCE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_LEVENSHTEIN_DISTANCE, null);
        r = consumeTokens(b, 2, F_LEVENSHTEIN_DISTANCE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_LIKE "(" string_argument "," string_argument ("," boolean_argument)? ")"
    public static boolean FunLike(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLike")) return false;
        if (!nextTokenIs(b, F_LIKE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_LIKE, null);
        r = consumeTokens(b, 2, F_LIKE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunLike_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunLike_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLike_5")) return false;
        FunLike_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunLike_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLike_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_LOG  "(" number_argument ")"
  public static boolean FunLog(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunLog")) return false;
      if (!nextTokenIs(b, F_LOG)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOG, null);
      r = consumeTokens(b, 2, F_LOG, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LOG10  "(" number_argument ")"
  public static boolean FunLog10(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunLog10")) return false;
      if (!nextTokenIs(b, F_LOG10)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOG_10, null);
      r = consumeTokens(b, 2, F_LOG10, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_LOG2  "(" number_argument ")"
  public static boolean FunLog2(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunLog2")) return false;
      if (!nextTokenIs(b, F_LOG2)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_LOG_2, null);
      r = consumeTokens(b, 2, F_LOG2, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_LOWER "(" string_argument ")"
    public static boolean FunLower(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLower")) return false;
        if (!nextTokenIs(b, F_LOWER)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_LOWER, null);
        r = consumeTokens(b, 2, F_LOWER, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_LTRIM "(" string_argument ("," string_argument)?")"
    public static boolean FunLtrim(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLtrim")) return false;
        if (!nextTokenIs(b, F_LTRIM)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_LTRIM, null);
        r = consumeTokens(b, 2, F_LTRIM, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, FunLtrim_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," string_argument)?
    private static boolean FunLtrim_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLtrim_3")) return false;
        FunLtrim_3_0(b, l + 1);
        return true;
    }

    // "," string_argument
    private static boolean FunLtrim_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunLtrim_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && string_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_MATCHES  "(" document_argument "," (ExpressionType | JsonType) ("," boolean_argument)?")"
    public static boolean FunMatches(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMatches")) return false;
        if (!nextTokenIs(b, F_MATCHES)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_MATCHES, null);
        r = consumeTokens(b, 2, F_MATCHES, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, document_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, FunMatches_4(b, l + 1)) && r;
        r = p && report_error_(b, FunMatches_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ExpressionType | JsonType
    private static boolean FunMatches_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMatches_4")) return false;
        boolean r;
        r = ExpressionType(b, l + 1);
        if (!r) r = JsonType(b, l + 1);
        return r;
    }

    // ("," boolean_argument)?
    private static boolean FunMatches_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMatches_5")) return false;
        FunMatches_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunMatches_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMatches_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_MAX  "(" number_argument_array ")"
  public static boolean FunMax(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunMax")) return false;
      if (!nextTokenIs(b, F_MAX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MAX, null);
      r = consumeTokens(b, 2, F_MAX, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_MD5 "(" string_argument ")"
    public static boolean FunMd5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMd5")) return false;
        if (!nextTokenIs(b, F_MD5)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_MD_5, null);
        r = consumeTokens(b, 2, F_MD5, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_MEDIAN  "(" number_argument_array ")"
  public static boolean FunMedian(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunMedian")) return false;
      if (!nextTokenIs(b, F_MEDIAN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MEDIAN, null);
      r = consumeTokens(b, 2, F_MEDIAN, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_MERGE  "(" document_argument "," (document_argument)* ")"
    public static boolean FunMerge(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMerge")) return false;
        if (!nextTokenIs(b, F_MERGE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_MERGE, null);
        r = consumeTokens(b, 2, F_MERGE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, document_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, FunMerge_4(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (document_argument)*
    private static boolean FunMerge_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMerge_4")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunMerge_4_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunMerge_4", c)) break;
        }
        return true;
    }

    // (document_argument)
    private static boolean FunMerge_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMerge_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = document_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_MERGE_RECURSIVE  "(" document_argument "," (document_argument)* ")"
    public static boolean FunMergeRecursive(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMergeRecursive")) return false;
        if (!nextTokenIs(b, F_MERGE_RECURSIVE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_MERGE_RECURSIVE, null);
        r = consumeTokens(b, 2, F_MERGE_RECURSIVE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, document_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, FunMergeRecursive_4(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (document_argument)*
    private static boolean FunMergeRecursive_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMergeRecursive_4")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunMergeRecursive_4_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunMergeRecursive_4", c)) break;
        }
        return true;
    }

    // (document_argument)
    private static boolean FunMergeRecursive_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMergeRecursive_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = document_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_MIN  "(" number_argument_array ")"
  public static boolean FunMin(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunMin")) return false;
      if (!nextTokenIs(b, F_MIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_MIN, null);
      r = consumeTokens(b, 2, F_MIN, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_MINUS  "(" (number_argument_array)+ ")"
    public static boolean FunMinus(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMinus")) return false;
        if (!nextTokenIs(b, F_MINUS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_MINUS, null);
        r = consumeTokens(b, 2, F_MINUS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunMinus_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)+
    private static boolean FunMinus_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMinus_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunMinus_2_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunMinus_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunMinus_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunMinus_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunMinus_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_NTH  "(" (number_argument_array) "," IntegerType ")"
    public static boolean FunNTH(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunNTH")) return false;
        if (!nextTokenIs(b, F_NTH)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_NTH, null);
        r = consumeTokens(b, 2, F_NTH, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunNTH_2(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, IntegerType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)
    private static boolean FunNTH_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunNTH_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_NOOPT "(" AnyType ")"
    public static boolean FunNoopt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunNoopt")) return false;
        if (!nextTokenIs(b, F_NOOPT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_NOOPT, null);
        r = consumeTokens(b, 2, F_NOOPT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_NOT_NULL "(" AnyType ("," AnyType)* ")"
    public static boolean FunNotNull(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunNotNull")) return false;
        if (!nextTokenIs(b, F_NOT_NULL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_NOT_NULL, null);
        r = consumeTokens(b, 2, F_NOT_NULL, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && report_error_(b, FunNotNull_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," AnyType)*
    private static boolean FunNotNull_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunNotNull_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunNotNull_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunNotNull_3", c)) break;
        }
        return true;
    }

    // "," AnyType
    private static boolean FunNotNull_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunNotNull_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && AnyType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_OUTERSECTION  "(" (number_argument_array)+ ")"
    public static boolean FunOuterSection(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunOuterSection")) return false;
        if (!nextTokenIs(b, F_OUTERSECTION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_OUTER_SECTION, null);
        r = consumeTokens(b, 2, F_OUTERSECTION, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunOuterSection_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)+
    private static boolean FunOuterSection_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunOuterSection_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunOuterSection_2_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunOuterSection_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunOuterSection_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunOuterSection_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunOuterSection_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_PARSE_IDENTIFIER  "(" StringType | document_argument  ")"
    public static boolean FunParseIdentifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunParseIdentifier")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_PARSE_IDENTIFIER, "<fun parse identifier>");
        r = FunParseIdentifier_0(b, l + 1);
        if (!r) r = FunParseIdentifier_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_PARSE_IDENTIFIER  "(" StringType
    private static boolean FunParseIdentifier_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunParseIdentifier_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_PARSE_IDENTIFIER, T_OPEN);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // document_argument  ")"
    private static boolean FunParseIdentifier_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunParseIdentifier_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = document_argument(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_PASSTHRU "(" AnyType ")"
    public static boolean FunPassThru(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPassThru")) return false;
        if (!nextTokenIs(b, F_PASSTHRU)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_PASS_THRU, null);
        r = consumeTokens(b, 2, F_PASSTHRU, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_PERCENTILE  "(" number_argument_array "," IntegerType ("," StringType)? ")"
  public static boolean FunPercentile(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunPercentile")) return false;
      if (!nextTokenIs(b, F_PERCENTILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_PERCENTILE, null);
      r = consumeTokens(b, 2, F_PERCENTILE, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, IntegerType(b, l + 1)) && r;
    r = p && report_error_(b, FunPercentile_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," StringType)?
  private static boolean FunPercentile_5(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunPercentile_5")) return false;
    FunPercentile_5_0(b, l + 1);
    return true;
  }

  // "," StringType
  private static boolean FunPercentile_5_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunPercentile_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && StringType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // F_PI "(" ")"
  public static boolean FunPi(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunPi")) return false;
      if (!nextTokenIs(b, F_PI)) return false;
      boolean r;
      Marker m = enter_section_(b);
      r = consumeTokens(b, 0, F_PI, T_OPEN, T_CLOSE);
      exit_section_(b, m, FUN_PI, r);
      return r;
  }

    /* ********************************************************** */
    // F_POP  "(" (number_argument_array)+ ")"
    public static boolean FunPop(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPop")) return false;
        if (!nextTokenIs(b, F_POP)) return false;
    boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_POP, null);
        r = consumeTokens(b, 2, F_POP, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunPop_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)+
    private static boolean FunPop_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPop_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunPop_2_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunPop_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunPop_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunPop_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPop_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_POSITION  "(" number_argument_array "," ExpressionType ("," boolean_argument)? ")"
    public static boolean FunPosition(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPosition")) return false;
        if (!nextTokenIs(b, F_POSITION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_POSITION, null);
        r = consumeTokens(b, 2, F_POSITION, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ExpressionType(b, l + 1)) && r;
        r = p && report_error_(b, FunPosition_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    // ("," boolean_argument)?
    private static boolean FunPosition_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPosition_5")) return false;
        FunPosition_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunPosition_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPosition_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_POW "(" number_argument "," number_argument ")"
  public static boolean FunPow(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunPow")) return false;
      if (!nextTokenIs(b, F_POW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_POW, null);
      r = consumeTokens(b, 2, F_POW, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, number_argument(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_PUSH  "(" number_argument_array "," ExpressionType ("," boolean_argument)? ")"
    public static boolean FunPush(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPush")) return false;
        if (!nextTokenIs(b, F_PUSH)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_PUSH, null);
        r = consumeTokens(b, 2, F_PUSH, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ExpressionType(b, l + 1)) && r;
        r = p && report_error_(b, FunPush_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunPush_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPush_5")) return false;
        FunPush_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunPush_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunPush_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_RADIANS "(" number_argument ")"
  public static boolean FunRadians(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunRadians")) return false;
      if (!nextTokenIs(b, F_RADIANS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RADIANS, null);
      r = consumeTokens(b, 2, F_RADIANS, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_RAND "(" ")"
  public static boolean FunRand(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunRand")) return false;
      if (!nextTokenIs(b, F_RAND)) return false;
      boolean r;
      Marker m = enter_section_(b);
      r = consumeTokens(b, 0, F_RAND, T_OPEN, T_CLOSE);
      exit_section_(b, m, FUN_RAND, r);
      return r;
  }

    /* ********************************************************** */
    // F_RANDOM_TOKEN "(" integer_argument ")"
    public static boolean FunRandomToken(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRandomToken")) return false;
        if (!nextTokenIs(b, F_RANDOM_TOKEN)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_RANDOM_TOKEN, null);
        r = consumeTokens(b, 2, F_RANDOM_TOKEN, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, integer_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_RANGE "(" number_argument "," number_argument ("," number_argument)? ")"
  public static boolean FunRange(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunRange")) return false;
      if (!nextTokenIs(b, F_RANGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_RANGE, null);
      r = consumeTokens(b, 2, F_RANGE, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
    r = p && report_error_(b, number_argument(b, l + 1)) && r;
    r = p && report_error_(b, FunRange_5(b, l + 1)) && r;
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ("," number_argument)?
  private static boolean FunRange_5(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunRange_5")) return false;
    FunRange_5_0(b, l + 1);
    return true;
  }

  // "," number_argument
  private static boolean FunRange_5_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunRange_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

    /* ********************************************************** */
    // F_REGEX_MATCHES "(" string_argument "," string_argument ("," boolean_argument)?  ")"
    public static boolean FunRegexMatches(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexMatches")) return false;
        if (!nextTokenIs(b, F_REGEX_MATCHES)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_MATCHES, null);
        r = consumeTokens(b, 2, F_REGEX_MATCHES, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunRegexMatches_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunRegexMatches_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexMatches_5")) return false;
        FunRegexMatches_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunRegexMatches_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexMatches_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_REGEX_REPLACE "(" string_argument "," string_argument "," string_argument  ("," boolean_argument)? ")"
    public static boolean FunRegexReplace(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexReplace")) return false;
        if (!nextTokenIs(b, F_REGEX_REPLACE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_REPLACE, null);
        r = consumeTokens(b, 2, F_REGEX_REPLACE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunRegexReplace_7(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunRegexReplace_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexReplace_7")) return false;
        FunRegexReplace_7_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunRegexReplace_7_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexReplace_7_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_REGEX_SPLIT "(" string_argument "," string_argument "," boolean_argument ("," integer_argument)? ")"
    public static boolean FunRegexSplit(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexSplit")) return false;
        if (!nextTokenIs(b, F_REGEX_SPLIT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_SPLIT, null);
        r = consumeTokens(b, 2, F_REGEX_SPLIT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, boolean_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunRegexSplit_7(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," integer_argument)?
    private static boolean FunRegexSplit_7(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexSplit_7")) return false;
        FunRegexSplit_7_0(b, l + 1);
        return true;
    }

    // "," integer_argument
    private static boolean FunRegexSplit_7_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexSplit_7_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_REGEX_TEST "(" string_argument "," string_argument  ("," boolean_argument)? ")"
    public static boolean FunRegexTest(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexTest")) return false;
        if (!nextTokenIs(b, F_REGEX_TEST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REGEX_TEST, null);
        r = consumeTokens(b, 2, F_REGEX_TEST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunRegexTest_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunRegexTest_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexTest_5")) return false;
        FunRegexTest_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunRegexTest_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRegexTest_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_REMOVE_NTH  "(" (number_argument_array) "," IntegerType ")"
    public static boolean FunRemoveNTH(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRemoveNTH")) return false;
        if (!nextTokenIs(b, F_REMOVE_NTH)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REMOVE_NTH, null);
        r = consumeTokens(b, 2, F_REMOVE_NTH, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunRemoveNTH_2(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, IntegerType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)
    private static boolean FunRemoveNTH_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRemoveNTH_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_REMOVE_VALUE  "(" number_argument_array "," ExpressionType ("," IntegerType)? ")"
    public static boolean FunRemoveValue(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRemoveValue")) return false;
        if (!nextTokenIs(b, F_REMOVE_VALUE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REMOVE_VALUE, null);
        r = consumeTokens(b, 2, F_REMOVE_VALUE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ExpressionType(b, l + 1)) && r;
        r = p && report_error_(b, FunRemoveValue_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," IntegerType)?
    private static boolean FunRemoveValue_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRemoveValue_5")) return false;
        FunRemoveValue_5_0(b, l + 1);
        return true;
    }

    // "," IntegerType
    private static boolean FunRemoveValue_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRemoveValue_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && IntegerType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_REMOVE_VALUES  "(" number_argument_array "," number_argument_array ")"
    public static boolean FunRemoveValues(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRemoveValues")) return false;
        if (!nextTokenIs(b, F_REMOVE_VALUES)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_REMOVE_VALUES, null);
        r = consumeTokens(b, 2, F_REMOVE_VALUES, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, number_argument_array(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_REVERSE  "(" string_argument | (number_argument_array)+ ")"
    public static boolean FunReverse(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunReverse")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_REVERSE, "<fun reverse>");
        r = FunReverse_0(b, l + 1);
        if (!r) r = FunReverse_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_REVERSE  "(" string_argument
    private static boolean FunReverse_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunReverse_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_REVERSE, T_OPEN);
        r = r && string_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)+ ")"
    private static boolean FunReverse_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunReverse_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunReverse_1_0(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)+
    private static boolean FunReverse_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunReverse_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunReverse_1_0_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunReverse_1_0_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunReverse_1_0", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunReverse_1_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunReverse_1_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_RIGHT "(" string_argument "," integer_argument ")"
    public static boolean FunRight(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRight")) return false;
        if (!nextTokenIs(b, F_RIGHT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_RIGHT, null);
        r = consumeTokens(b, 2, F_RIGHT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, integer_argument(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_ROUND "(" number_argument ")"
  public static boolean FunRound(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunRound")) return false;
      if (!nextTokenIs(b, F_ROUND)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_ROUND, null);
      r = consumeTokens(b, 2, F_ROUND, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_RTRIM "(" string_argument ("," string_argument)? ")"
    public static boolean FunRtrim(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRtrim")) return false;
        if (!nextTokenIs(b, F_RTRIM)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_RTRIM, null);
        r = consumeTokens(b, 2, F_RTRIM, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, FunRtrim_3(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," string_argument)?
    private static boolean FunRtrim_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRtrim_3")) return false;
        FunRtrim_3_0(b, l + 1);
        return true;
    }

    // "," string_argument
    private static boolean FunRtrim_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunRtrim_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && string_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_SQRT "(" number_argument ")"
  public static boolean FunSQRT(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunSQRT")) return false;
      if (!nextTokenIs(b, F_SQRT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SQRT, null);
      r = consumeTokens(b, 2, F_SQRT, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_SHA1 "(" string_argument  ")"
    public static boolean FunSha1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSha1")) return false;
        if (!nextTokenIs(b, F_SHA1)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SHA_1, null);
        r = consumeTokens(b, 2, F_SHA1, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_SHA512 "(" string_argument  ")"
    public static boolean FunSha512(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSha512")) return false;
        if (!nextTokenIs(b, F_SHA512)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SHA_512, null);
        r = consumeTokens(b, 2, F_SHA512, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_SHIFT  "(" number_argument_array ")"
    public static boolean FunShift(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunShift")) return false;
        if (!nextTokenIs(b, F_SHIFT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SHIFT, null);
        r = consumeTokens(b, 2, F_SHIFT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // F_SIN "(" number_argument ")"
  public static boolean FunSin(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunSin")) return false;
      if (!nextTokenIs(b, F_SIN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SIN, null);
      r = consumeTokens(b, 2, F_SIN, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_SLEEP "(" IntegerType ")"
    public static boolean FunSleep(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSleep")) return false;
        if (!nextTokenIs(b, F_SLEEP)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SLEEP, null);
        r = consumeTokens(b, 2, F_SLEEP, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, IntegerType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_SLICE  "(" number_argument_array "," IntegerType ("," IntegerType)? ")"
    public static boolean FunSlice(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSlice")) return false;
        if (!nextTokenIs(b, F_SLICE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SLICE, null);
        r = consumeTokens(b, 2, F_SLICE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, IntegerType(b, l + 1)) && r;
        r = p && report_error_(b, FunSlice_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," IntegerType)?
    private static boolean FunSlice_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSlice_5")) return false;
        FunSlice_5_0(b, l + 1);
        return true;
    }

    // "," IntegerType
    private static boolean FunSlice_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSlice_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && IntegerType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_SORTED  "(" number_argument_array ")"
    public static boolean FunSorted(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSorted")) return false;
        if (!nextTokenIs(b, F_SORTED)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SORTED, null);
        r = consumeTokens(b, 2, F_SORTED, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_SORTED_UNIQUE  "(" number_argument_array ")"
    public static boolean FunSortedUnique(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSortedUnique")) return false;
        if (!nextTokenIs(b, F_SORTED_UNIQUE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SORTED_UNIQUE, null);
        r = consumeTokens(b, 2, F_SORTED_UNIQUE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_SOUNDEX "(" string_argument ")"
    public static boolean FunSoundex(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSoundex")) return false;
        if (!nextTokenIs(b, F_SOUNDEX)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SOUNDEX, null);
        r = consumeTokens(b, 2, F_SOUNDEX, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_SPLIT "(" string_argument "," string_argument  ("," integer_argument)? ")"
    public static boolean FunSplit(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSplit")) return false;
        if (!nextTokenIs(b, F_SPLIT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SPLIT, null);
        r = consumeTokens(b, 2, F_SPLIT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, string_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunSplit_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," integer_argument)?
    private static boolean FunSplit_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSplit_5")) return false;
        FunSplit_5_0(b, l + 1);
        return true;
    }

    // "," integer_argument
    private static boolean FunSplit_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSplit_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_STDDEV "(" number_argument_array ")"
  public static boolean FunStddev(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunStddev")) return false;
      if (!nextTokenIs(b, F_STDDEV)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STDDEV, null);
      r = consumeTokens(b, 2, F_STDDEV, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_STDDEV_POPULATION "(" number_argument_array ")"
  public static boolean FunStddevPopulation(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunStddevPopulation")) return false;
      if (!nextTokenIs(b, F_STDDEV_POPULATION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_STDDEV_POPULATION, null);
      r = consumeTokens(b, 2, F_STDDEV_POPULATION, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_SUBSTITUTE "(" string_argument  ("," string_argument | string_array) ("," string_argument | string_array)? ("," integer_argument)?  ")"
    public static boolean FunSubstitute(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute")) return false;
        if (!nextTokenIs(b, F_SUBSTITUTE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SUBSTITUTE, null);
        r = consumeTokens(b, 2, F_SUBSTITUTE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, FunSubstitute_3(b, l + 1)) && r;
        r = p && report_error_(b, FunSubstitute_4(b, l + 1)) && r;
        r = p && report_error_(b, FunSubstitute_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // "," string_argument | string_array
    private static boolean FunSubstitute_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunSubstitute_3_0(b, l + 1);
        if (!r) r = string_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // "," string_argument
    private static boolean FunSubstitute_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && string_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," string_argument | string_array)?
    private static boolean FunSubstitute_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_4")) return false;
        FunSubstitute_4_0(b, l + 1);
        return true;
    }

    // "," string_argument | string_array
    private static boolean FunSubstitute_4_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_4_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunSubstitute_4_0_0(b, l + 1);
        if (!r) r = string_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // "," string_argument
    private static boolean FunSubstitute_4_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_4_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && string_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," integer_argument)?
    private static boolean FunSubstitute_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_5")) return false;
        FunSubstitute_5_0(b, l + 1);
        return true;
    }

    // "," integer_argument
    private static boolean FunSubstitute_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstitute_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_SUBSTRING "(" string_argument "," integer_argument ("," integer_argument)?  ")"
    public static boolean FunSubstring(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstring")) return false;
        if (!nextTokenIs(b, F_SUBSTRING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_SUBSTRING, null);
        r = consumeTokens(b, 2, F_SUBSTRING, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, integer_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunSubstring_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," integer_argument)?
    private static boolean FunSubstring_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstring_5")) return false;
        FunSubstring_5_0(b, l + 1);
        return true;
    }

    // "," integer_argument
    private static boolean FunSubstring_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunSubstring_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_SUM "(" number_argument_array ")"
  public static boolean FunSum(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunSum")) return false;
      if (!nextTokenIs(b, F_SUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_SUM, null);
      r = consumeTokens(b, 2, F_SUM, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TAN "(" number_argument ")"
  public static boolean FunTan(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunTan")) return false;
      if (!nextTokenIs(b, F_TAN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TAN, null);
      r = consumeTokens(b, 2, F_TAN, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_TAN2 "(" number_argument ")"
  public static boolean FunTan2(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunTan2")) return false;
      if (!nextTokenIs(b, F_TAN2)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_TAN_2, null);
      r = consumeTokens(b, 2, F_TAN2, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_TO_ARRAY "(" AnyType ")"
    public static boolean FunToArray(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToArray")) return false;
        if (!nextTokenIs(b, F_TO_ARRAY)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_ARRAY, null);
        r = consumeTokens(b, 2, F_TO_ARRAY, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TO_BASE64 "(" string_argument ")"
    public static boolean FunToBase64(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToBase64")) return false;
        if (!nextTokenIs(b, F_TO_BASE64)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_BASE_64, null);
        r = consumeTokens(b, 2, F_TO_BASE64, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TO_BOOL "(" AnyType ")"
    public static boolean FunToBool(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToBool")) return false;
        if (!nextTokenIs(b, F_TO_BOOL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_BOOL, null);
        r = consumeTokens(b, 2, F_TO_BOOL, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TO_HEX "(" string_argument ")"
    public static boolean FunToHex(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToHex")) return false;
        if (!nextTokenIs(b, F_TO_HEX)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_HEX, null);
        r = consumeTokens(b, 2, F_TO_HEX, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TO_LIST "(" AnyType ")"
    public static boolean FunToList(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToList")) return false;
        if (!nextTokenIs(b, F_TO_LIST)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_LIST, null);
        r = consumeTokens(b, 2, F_TO_LIST, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TO_NUMBER "(" AnyType ")"
    public static boolean FunToNumber(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToNumber")) return false;
        if (!nextTokenIs(b, F_TO_NUMBER)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_NUMBER, null);
        r = consumeTokens(b, 2, F_TO_NUMBER, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TO_STRING "(" AnyType ")"
    public static boolean FunToString(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunToString")) return false;
        if (!nextTokenIs(b, F_TO_STRING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TO_STRING, null);
        r = consumeTokens(b, 2, F_TO_STRING, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TOKENS "(" string_argument "," AnalyzerType ")"
    public static boolean FunTokens(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTokens")) return false;
        if (!nextTokenIs(b, F_TOKENS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TOKENS, null);
        r = consumeTokens(b, 2, F_TOKENS, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, AnalyzerType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_TRANSLATE  "(" string_argument "," objects_argument ("," AnyType)? ")"
    public static boolean FunTranslate(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTranslate")) return false;
        if (!nextTokenIs(b, F_TRANSLATE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TRANSLATE, null);
        r = consumeTokens(b, 2, F_TRANSLATE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, objects_argument(b, l + 1)) && r;
        r = p && report_error_(b, FunTranslate_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," AnyType)?
    private static boolean FunTranslate_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTranslate_5")) return false;
        FunTranslate_5_0(b, l + 1);
        return true;
    }

    // "," AnyType
    private static boolean FunTranslate_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTranslate_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && AnyType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_TRIM "(" string_argument (("," string_argument) | ("," integer_argument)?   ")")
    public static boolean FunTrim(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTrim")) return false;
        if (!nextTokenIs(b, F_TRIM)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TRIM, null);
        r = consumeTokens(b, 2, F_TRIM, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && FunTrim_3(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," string_argument) | ("," integer_argument)?   ")"
    private static boolean FunTrim_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTrim_3")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunTrim_3_0(b, l + 1);
        if (!r) r = FunTrim_3_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // "," string_argument
    private static boolean FunTrim_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTrim_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && string_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," integer_argument)?   ")"
    private static boolean FunTrim_3_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTrim_3_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunTrim_3_1_0(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," integer_argument)?
    private static boolean FunTrim_3_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTrim_3_1_0")) return false;
        FunTrim_3_1_0_0(b, l + 1);
        return true;
    }

    // "," integer_argument
    private static boolean FunTrim_3_1_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTrim_3_1_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && integer_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_TYPENAME "(" AnyType ")"
    public static boolean FunTypename(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunTypename")) return false;
        if (!nextTokenIs(b, F_TYPENAME)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_TYPENAME, null);
        r = consumeTokens(b, 2, F_TYPENAME, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_UNSHIFT  "(" number_argument_array "," ExpressionType ("," boolean_argument)? ")"
    public static boolean FunUnShift(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnShift")) return false;
        if (!nextTokenIs(b, F_UNSHIFT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_UN_SHIFT, null);
        r = consumeTokens(b, 2, F_UNSHIFT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ExpressionType(b, l + 1)) && r;
        r = p && report_error_(b, FunUnShift_5(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ("," boolean_argument)?
    private static boolean FunUnShift_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnShift_5")) return false;
        FunUnShift_5_0(b, l + 1);
        return true;
    }

    // "," boolean_argument
    private static boolean FunUnShift_5_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnShift_5_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && boolean_argument(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_UNION  "(" (number_argument_array)+ ")"
    public static boolean FunUnion(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnion")) return false;
        if (!nextTokenIs(b, F_UNION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_UNION, null);
        r = consumeTokens(b, 2, F_UNION, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunUnion_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)+
    private static boolean FunUnion_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnion_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunUnion_2_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunUnion_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunUnion_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunUnion_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnion_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_UNION_DISTINCT  "(" (number_argument_array)+ ")"
    public static boolean FunUnionDistinct(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnionDistinct")) return false;
        if (!nextTokenIs(b, F_UNION_DISTINCT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_UNION_DISTINCT, null);
        r = consumeTokens(b, 2, F_UNION_DISTINCT, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, FunUnionDistinct_2(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // (number_argument_array)+
    private static boolean FunUnionDistinct_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnionDistinct_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = FunUnionDistinct_2_0(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!FunUnionDistinct_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunUnionDistinct_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (number_argument_array)
    private static boolean FunUnionDistinct_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnionDistinct_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = number_argument_array(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_UNIQUE  "(" number_argument_array ")"
    public static boolean FunUnique(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnique")) return false;
        if (!nextTokenIs(b, F_UNIQUE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_UNIQUE, null);
        r = consumeTokens(b, 2, F_UNIQUE, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, number_argument_array(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_UNSET "(" objects_argument ("," StringType)* | ArrayType ")"
    public static boolean FunUnset(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnset")) return false;
        if (!nextTokenIs(b, "<fun unset>", F_UNSET, T_ARRAY_OPEN)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_UNSET, "<fun unset>");
        r = FunUnset_0(b, l + 1);
        if (!r) r = FunUnset_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_UNSET "(" objects_argument ("," StringType)*
    private static boolean FunUnset_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnset_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_UNSET, T_OPEN);
        r = r && objects_argument(b, l + 1);
        r = r && FunUnset_0_3(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," StringType)*
    private static boolean FunUnset_0_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnset_0_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunUnset_0_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunUnset_0_3", c)) break;
        }
        return true;
    }

    // "," StringType
    private static boolean FunUnset_0_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnset_0_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ArrayType ")"
    private static boolean FunUnset_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnset_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ArrayType(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_UNSET_RECURSIVE "(" objects_argument ("," StringType)* | ArrayType ")"
    public static boolean FunUnsetRecursive(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnsetRecursive")) return false;
        if (!nextTokenIs(b, "<fun unset recursive>", F_UNSET_RECURSIVE, T_ARRAY_OPEN)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_UNSET_RECURSIVE, "<fun unset recursive>");
        r = FunUnsetRecursive_0(b, l + 1);
        if (!r) r = FunUnsetRecursive_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_UNSET_RECURSIVE "(" objects_argument ("," StringType)*
    private static boolean FunUnsetRecursive_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnsetRecursive_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_UNSET_RECURSIVE, T_OPEN);
        r = r && objects_argument(b, l + 1);
        r = r && FunUnsetRecursive_0_3(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," StringType)*
    private static boolean FunUnsetRecursive_0_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnsetRecursive_0_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunUnsetRecursive_0_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunUnsetRecursive_0_3", c)) break;
        }
        return true;
    }

    // "," StringType
    private static boolean FunUnsetRecursive_0_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnsetRecursive_0_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ArrayType ")"
    private static boolean FunUnsetRecursive_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUnsetRecursive_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ArrayType(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // F_UPPER "(" string_argument ")"
    public static boolean FunUpper(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUpper")) return false;
        if (!nextTokenIs(b, F_UPPER)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_UPPER, null);
        r = consumeTokens(b, 2, F_UPPER, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, string_argument(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_UUID "(" ")"
    public static boolean FunUuid(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunUuid")) return false;
        if (!nextTokenIs(b, F_UUID)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_UUID, null);
        r = consumeTokens(b, 2, F_UUID, T_OPEN, T_CLOSE);
        p = r; // pin = 2
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_V8 "(" ExpressionType ")"
    public static boolean FunV8(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunV8")) return false;
        if (!nextTokenIs(b, F_V8)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_V_8, null);
        r = consumeTokens(b, 2, F_V8, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, ExpressionType(b, l + 1));
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_VALUES "(" objects_argument ("," StringType)* | ArrayType ")"
    public static boolean FunValues(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunValues")) return false;
        if (!nextTokenIs(b, "<fun values>", F_VALUES, T_ARRAY_OPEN)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUN_VALUES, "<fun values>");
        r = FunValues_0(b, l + 1);
        if (!r) r = FunValues_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // F_VALUES "(" objects_argument ("," StringType)*
    private static boolean FunValues_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunValues_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, F_VALUES, T_OPEN);
        r = r && objects_argument(b, l + 1);
        r = r && FunValues_0_3(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," StringType)*
    private static boolean FunValues_0_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunValues_0_3")) return false;
        while (true) {
            int c = current_position_(b);
            if (!FunValues_0_3_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunValues_0_3", c)) break;
        }
        return true;
    }

    // "," StringType
    private static boolean FunValues_0_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunValues_0_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ArrayType ")"
    private static boolean FunValues_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunValues_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ArrayType(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

  /* ********************************************************** */
  // F_VARIANCE "(" number_argument_array ")"
  public static boolean FunVariance(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunVariance")) return false;
      if (!nextTokenIs(b, F_VARIANCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE, null);
      r = consumeTokens(b, 2, F_VARIANCE, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE_POPULATION "(" number_argument_array ")"
  public static boolean FunVariancePopulation(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunVariancePopulation")) return false;
      if (!nextTokenIs(b, F_VARIANCE_POPULATION)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE_POPULATION, null);
      r = consumeTokens(b, 2, F_VARIANCE_POPULATION, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // F_VARIANCE_SAMPLE "(" number_argument_array ")"
  public static boolean FunVarianceSample(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunVarianceSample")) return false;
      if (!nextTokenIs(b, F_VARIANCE_SAMPLE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUN_VARIANCE_SAMPLE, null);
      r = consumeTokens(b, 2, F_VARIANCE_SAMPLE, T_OPEN);
      p = r; // pin = 2
    r = r && report_error_(b, number_argument_array(b, l + 1));
    r = p && consumeToken(b, T_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    /* ********************************************************** */
    // F_VERSION "("  ")"
    public static boolean FunVersion(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunVersion")) return false;
        if (!nextTokenIs(b, F_VERSION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_VERSION, null);
        r = consumeTokens(b, 2, F_VERSION, T_OPEN, T_CLOSE);
        p = r; // pin = 2
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_WARN "(" AnyType "," StringType ")"
    public static boolean FunWarn(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunWarn")) return false;
        if (!nextTokenIs(b, F_WARN)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_WARN, null);
        r = consumeTokens(b, 2, F_WARN, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, AnyType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, StringType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // F_ZIP "(" ArrayType "," ArrayType ")"
    public static boolean FunZip(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunZip")) return false;
        if (!nextTokenIs(b, F_ZIP)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, FUN_ZIP, null);
        r = consumeTokens(b, 2, F_ZIP, T_OPEN);
        p = r; // pin = 2
        r = r && report_error_(b, ArrayType(b, l + 1));
        r = p && report_error_(b, consumeToken(b, T_COMMA)) && r;
        r = p && report_error_(b, ArrayType(b, l + 1)) && r;
        r = p && consumeToken(b, T_CLOSE) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

  /* ********************************************************** */
  // NamedFunctions | (NamedKeywordFunctions T_OPEN ExpressionArray* T_CLOSE)
  public static boolean FunctionExpression(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunctionExpression")) return false;
      boolean r;
      Marker m = enter_section_(b, l, _NONE_, FUNCTION_EXPRESSION, "<function expression>");
      r = NamedFunctions(b, l + 1);
      if (!r) r = FunctionExpression_1(b, l + 1);
      exit_section_(b, l, m, r, false, null);
      return r;
  }

    // NamedKeywordFunctions T_OPEN ExpressionArray* T_CLOSE
    private static boolean FunctionExpression_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunctionExpression_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = NamedKeywordFunctions(b, l + 1);
        r = r && consumeToken(b, T_OPEN);
        r = r && FunctionExpression_1_2(b, l + 1);
        r = r && consumeToken(b, T_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

  // ExpressionArray*
  private static boolean FunctionExpression_1_2(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "FunctionExpression_1_2")) return false;
    while (true) {
      int c = current_position_(b);
        if (!ExpressionArray(b, l + 1)) break;
        if (!empty_element_parsed_guard_(b, "FunctionExpression_1_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NUMBER_INTEGER
  public static boolean IntegerType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IntegerType")) return false;
    if (!nextTokenIs(b, NUMBER_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER_INTEGER);
    exit_section_(b, m, INTEGER_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // '{' object_element* '}'
  public static boolean JsonType(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "JsonType")) return false;
      if (!nextTokenIs(b, T_OBJECT_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, JSON_TYPE, null);
    r = consumeToken(b, T_OBJECT_OPEN);
      p = r; // pin = 1
      r = r && report_error_(b, JsonType_1(b, l + 1));
    r = p && consumeToken(b, T_OBJECT_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

    // object_element*
  private static boolean JsonType_1(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "JsonType_1")) return false;
    while (true) {
      int c = current_position_(b);
        if (!object_element(b, l + 1)) break;
        if (!empty_element_parsed_guard_(b, "JsonType_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // F_DATE_SUBTRACT
  //                         | F_DATE_MINUTE
  //                         | F_DATE_LEAPYEAR
  //                         | F_STDDEV_SAMPLE
  //                         | F_CURRENT_DATABASE
  //                         | F_DATE_DAYOFYEAR
  //                         | F_DATE_DAY
  //                         | F_DATE_DAYS_IN_MONTH
  //                         | F_STARTS_WITH
  //                         | F_DATE_DAYOFWEEK
  //                         | F_TFIDF
  //                         | F_DATE_ISO8601
  //                         | F_DATE_TRUNC
  //                         | F_DATE_FORMAT
  //                         | F_KEYS
  //                         | F_BOOST
  //                         | F_MIN_MATCH
  //                         | F_DATE_ISOWEEK
  //                         | F_DATE_SECOND
  //                         | F_BM25
  //                         | F_DATE_MONTH
  //                         | F_PREGEL_RESULT
  //                         | F_DATE_ADD
  //                         | F_DATE_MILLISECOND
  //                         | F_DATE_QUARTER
  //                         | F_ANALYZER
  //                         | F_PHRASE
  //                         | F_DATE_NOW
  //                         | F_DATE_COMPARE
  //                         | F_DATE_YEAR
  //                         | F_DATE_TIMESTAMP
  //                         | F_EXISTS
  //                         | F_DATE_HOUR
  //                         | F_DATE_DIFF
  public static boolean KeywordFunctions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeywordFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_FUNCTIONS, "<keyword functions>");
      r = consumeToken(b, F_DATE_SUBTRACT);
    if (!r) r = consumeToken(b, F_DATE_MINUTE);
    if (!r) r = consumeToken(b, F_DATE_LEAPYEAR);
    if (!r) r = consumeToken(b, F_STDDEV_SAMPLE);
    if (!r) r = consumeToken(b, F_CURRENT_DATABASE);
    if (!r) r = consumeToken(b, F_DATE_DAYOFYEAR);
    if (!r) r = consumeToken(b, F_DATE_DAY);
    if (!r) r = consumeToken(b, F_DATE_DAYS_IN_MONTH);
    if (!r) r = consumeToken(b, F_STARTS_WITH);
    if (!r) r = consumeToken(b, F_DATE_DAYOFWEEK);
    if (!r) r = consumeToken(b, F_TFIDF);
    if (!r) r = consumeToken(b, F_DATE_ISO8601);
    if (!r) r = consumeToken(b, F_DATE_TRUNC);
    if (!r) r = consumeToken(b, F_DATE_FORMAT);
    if (!r) r = consumeToken(b, F_KEYS);
    if (!r) r = consumeToken(b, F_BOOST);
    if (!r) r = consumeToken(b, F_MIN_MATCH);
    if (!r) r = consumeToken(b, F_DATE_ISOWEEK);
    if (!r) r = consumeToken(b, F_DATE_SECOND);
    if (!r) r = consumeToken(b, F_BM25);
    if (!r) r = consumeToken(b, F_DATE_MONTH);
    if (!r) r = consumeToken(b, F_PREGEL_RESULT);
    if (!r) r = consumeToken(b, F_DATE_ADD);
    if (!r) r = consumeToken(b, F_DATE_MILLISECOND);
    if (!r) r = consumeToken(b, F_DATE_QUARTER);
    if (!r) r = consumeToken(b, F_ANALYZER);
    if (!r) r = consumeToken(b, F_PHRASE);
    if (!r) r = consumeToken(b, F_DATE_NOW);
    if (!r) r = consumeToken(b, F_DATE_COMPARE);
    if (!r) r = consumeToken(b, F_DATE_YEAR);
    if (!r) r = consumeToken(b, F_DATE_TIMESTAMP);
    if (!r) r = consumeToken(b, F_EXISTS);
    if (!r) r = consumeToken(b, F_DATE_HOUR);
    if (!r) r = consumeToken(b, F_DATE_DIFF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_SHORTEST_PATH
  //                         | T_SEARCH
  //                         | T_REPLACE
  //                         | T_ASC
  //                         | T_AGGREGATE
  //                         | T_FILTER
  //                         | T_DESC
  //                         | T_IN
  //                         | T_INTO
  //                         | T_LIMIT
  //                         | T_UPDATE
  //                         | T_SORT
  //                         | T_GRAPH
  //                         | T_FOR
  //                         | T_LET
  //                         | T_COLLECT
  //                         | T_WITH
  //                         | T_DISTINCT
  //                         | T_RETURN
  //                         | T_UPSERT
  //                         | T_REMOVE
  //                         | T_INSERT
  //                         | T_OUTBOUND
  //                         | T_INBOUND
  //                         | T_ANY
  //                         | T_ALL
  //                         | T_NONE
  public static boolean KeywordStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeywordStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_STATEMENTS, "<keyword statements>");
    r = consumeToken(b, T_SHORTEST_PATH);
    if (!r) r = consumeToken(b, T_SEARCH);
    if (!r) r = consumeToken(b, T_REPLACE);
    if (!r) r = consumeToken(b, T_ASC);
    if (!r) r = consumeToken(b, T_AGGREGATE);
    if (!r) r = consumeToken(b, T_FILTER);
    if (!r) r = consumeToken(b, T_DESC);
    if (!r) r = consumeToken(b, T_IN);
    if (!r) r = consumeToken(b, T_INTO);
    if (!r) r = consumeToken(b, T_LIMIT);
    if (!r) r = consumeToken(b, T_UPDATE);
    if (!r) r = consumeToken(b, T_SORT);
    if (!r) r = consumeToken(b, T_GRAPH);
    if (!r) r = consumeToken(b, T_FOR);
    if (!r) r = consumeToken(b, T_LET);
    if (!r) r = consumeToken(b, T_COLLECT);
    if (!r) r = consumeToken(b, T_WITH);
    if (!r) r = consumeToken(b, T_DISTINCT);
    if (!r) r = consumeToken(b, T_RETURN);
    if (!r) r = consumeToken(b, T_UPSERT);
    if (!r) r = consumeToken(b, T_REMOVE);
    if (!r) r = consumeToken(b, T_INSERT);
      if (!r) r = consumeToken(b, T_OUTBOUND);
      if (!r) r = consumeToken(b, T_INBOUND);
      if (!r) r = consumeToken(b, T_ANY);
      if (!r) r = consumeToken(b, T_ALL);
      if (!r) r = consumeToken(b, T_NONE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // L_COMMENT
  public static boolean LineComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LineComment")) return false;
    if (!nextTokenIs(b, L_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, L_COMMENT);
    exit_section_(b, m, LINE_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // FunAbs
  //               | FunConcat
  //               | FunContains
  //               | FunEncodeUriComponent
  //               | FunFindFirst
  //               | FunFindLast
  //               | FunJsonParse
  //               | FunJsonStringify
  //               | FunLeft
  //               | FunLevenshteinDistance
  //               | FunLike
  //               | FunLower
  //               | FunLtrim
  //               | FunMd5
  //               | FunRandomToken
  //               | FunRegexMatches
  //               | FunRegexSplit
  //               | FunRegexTest
  //               | FunRegexReplace
  //               | FunRight
  //               | FunRtrim
  //               | FunSha1
  //               | FunSha512
  //               | FunSplit
  //               | FunSoundex
  //               | FunSubstitute
  //               | FunSubstring
  //               | FunTokens
  //               | FunToBase64
  //               | FunToHex
  //               | FunTrim
  //               | FunUpper
  //               | FunUuid
  //               | FunDistance
  //               | FunGeoContains
  //               | FunGeoDistance
  //               | FunGeoEquals
  //               | FunGeoIntersects
  //               | FunGeoLineString
  //               | FunGeoMultiLineString
  //               | FunGeoMultiPoint
  //               | FunGeoPoint
  //               | FunGeoPolygon
  //               | FunNotNull
  //               | FunFirstList
  //               | FunFirstDocument
  //               | FunCollectionCount
  //               | FunCollections
  //               | FunCurrentUser
  //               | FunDocument
  //               | FunHash
  //               | FunApply
  //               | FunAssert
  //               | FunWarn
  //               | FunCall
  //               | FunFail
  //               | FunNoopt
  //               | FunPassThru
  //               | FunSleep
  //               | FunV8
  //               | FunVersion
  //               | FunCharLength
  //               | FunAttributes
  //               | FunMerge
  //               | FunMergeRecursive
  //               | FunParseIdentifier
  //               | FunTranslate
  //               | FunUnset
  //               | FunValues
  //               | FunZip
  //               | FunUnsetRecursive
  //               | FunIsSameCollection
  //               | FunHas
  //               | FunKeep
  //               | FunFullText
  //               | FunMatches
  //               | FunAcos
  //               | FunToBool
  //               | FunToString
  //               | FunToNumber
  //               | FunToArray
  //               | FunToList
  //               | FunIsNull
  //               | FunIsBool
  //               | FunIsNumber
  //               | FunIsString
  //               | FunIsArray
  //               | FunIsList
  //               | FunIsObject
  //               | FunIsDocument
  //               | FunIsDateString
  //               | FunIsKey
  //               | FunTypename
  //               | FunAsin
  //               | FunAvg
  //               | FunAverage
  //               | FunTan
  //               | FunTan2
  //               | FunAtan
  //               | FunSin
  //               | FunAtan2
  //               | FunCos
  //               | FunDegrees
  //               | FunMin
  //               | FunPosition
  //               | FunContainsArray
  //               | FunAppend
  //               | FunLength
  //               | FunCount
  //               | FunCountDistinct
  //               | FunCountUnique
  //               | FunFirst
  //               | FunLast
  //               | FunFlatten
  //               | FunInterSection
  //               | FunMinus
  //               | FunNTH
  //               | FunRemoveNTH
  //               | FunOuterSection
  //               | FunRemoveValue
  //               | FunPop
  //               | FunRemoveValues
  //               | FunPush
  //               | FunReverse
  //               | FunShift
  //               | FunSlice
  //               | FunSorted
  //               | FunSortedUnique
  //               | FunUnion
  //               | FunUnionDistinct
  //               | FunUnique
  //               | FunUnShift
  //               | FunMedian
  //               | FunLog10
  //               | FunMax
  //               | FunSQRT
  //               | FunPercentile
  //               | FunPi
  //               | FunLog2
  //               | FunLog
  //               | FunFloor
  //               | FunExp2
  //               | FunExp
  //               | FunCeil
  //               | FunRand
  //               | FunSum
  //               | FunStddev
  //               | FunPow
  //               | FunVarianceSample
  //               | FunStddevPopulation
  //               | FunVariancePopulation
  //               | FunRadians
  //               | FunRange
  //               | FunRound
  //               | FunVariance
  //               | FunConcatSeparator
  public static boolean NamedFunctions(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "NamedFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_FUNCTIONS, "<named functions>");
    r = FunAbs(b, l + 1);
      if (!r) r = FunConcat(b, l + 1);
      if (!r) r = FunContains(b, l + 1);
      if (!r) r = FunEncodeUriComponent(b, l + 1);
      if (!r) r = FunFindFirst(b, l + 1);
      if (!r) r = FunFindLast(b, l + 1);
      if (!r) r = FunJsonParse(b, l + 1);
      if (!r) r = FunJsonStringify(b, l + 1);
      if (!r) r = FunLeft(b, l + 1);
      if (!r) r = FunLevenshteinDistance(b, l + 1);
      if (!r) r = FunLike(b, l + 1);
      if (!r) r = FunLower(b, l + 1);
      if (!r) r = FunLtrim(b, l + 1);
      if (!r) r = FunMd5(b, l + 1);
      if (!r) r = FunRandomToken(b, l + 1);
      if (!r) r = FunRegexMatches(b, l + 1);
      if (!r) r = FunRegexSplit(b, l + 1);
      if (!r) r = FunRegexTest(b, l + 1);
      if (!r) r = FunRegexReplace(b, l + 1);
      if (!r) r = FunRight(b, l + 1);
      if (!r) r = FunRtrim(b, l + 1);
      if (!r) r = FunSha1(b, l + 1);
      if (!r) r = FunSha512(b, l + 1);
      if (!r) r = FunSplit(b, l + 1);
      if (!r) r = FunSoundex(b, l + 1);
      if (!r) r = FunSubstitute(b, l + 1);
      if (!r) r = FunSubstring(b, l + 1);
      if (!r) r = FunTokens(b, l + 1);
      if (!r) r = FunToBase64(b, l + 1);
      if (!r) r = FunToHex(b, l + 1);
      if (!r) r = FunTrim(b, l + 1);
      if (!r) r = FunUpper(b, l + 1);
      if (!r) r = FunUuid(b, l + 1);
      if (!r) r = FunDistance(b, l + 1);
      if (!r) r = FunGeoContains(b, l + 1);
      if (!r) r = FunGeoDistance(b, l + 1);
      if (!r) r = FunGeoEquals(b, l + 1);
      if (!r) r = FunGeoIntersects(b, l + 1);
      if (!r) r = FunGeoLineString(b, l + 1);
      if (!r) r = FunGeoMultiLineString(b, l + 1);
      if (!r) r = FunGeoMultiPoint(b, l + 1);
      if (!r) r = FunGeoPoint(b, l + 1);
      if (!r) r = FunGeoPolygon(b, l + 1);
      if (!r) r = FunNotNull(b, l + 1);
      if (!r) r = FunFirstList(b, l + 1);
      if (!r) r = FunFirstDocument(b, l + 1);
      if (!r) r = FunCollectionCount(b, l + 1);
      if (!r) r = FunCollections(b, l + 1);
      if (!r) r = FunCurrentUser(b, l + 1);
      if (!r) r = FunDocument(b, l + 1);
      if (!r) r = FunHash(b, l + 1);
      if (!r) r = FunApply(b, l + 1);
      if (!r) r = FunAssert(b, l + 1);
      if (!r) r = FunWarn(b, l + 1);
      if (!r) r = FunCall(b, l + 1);
      if (!r) r = FunFail(b, l + 1);
      if (!r) r = FunNoopt(b, l + 1);
      if (!r) r = FunPassThru(b, l + 1);
      if (!r) r = FunSleep(b, l + 1);
      if (!r) r = FunV8(b, l + 1);
      if (!r) r = FunVersion(b, l + 1);
      if (!r) r = FunCharLength(b, l + 1);
      if (!r) r = FunAttributes(b, l + 1);
      if (!r) r = FunMerge(b, l + 1);
      if (!r) r = FunMergeRecursive(b, l + 1);
      if (!r) r = FunParseIdentifier(b, l + 1);
      if (!r) r = FunTranslate(b, l + 1);
      if (!r) r = FunUnset(b, l + 1);
      if (!r) r = FunValues(b, l + 1);
      if (!r) r = FunZip(b, l + 1);
      if (!r) r = FunUnsetRecursive(b, l + 1);
      if (!r) r = FunIsSameCollection(b, l + 1);
      if (!r) r = FunHas(b, l + 1);
      if (!r) r = FunKeep(b, l + 1);
      if (!r) r = FunFullText(b, l + 1);
      if (!r) r = FunMatches(b, l + 1);
      if (!r) r = FunAcos(b, l + 1);
      if (!r) r = FunToBool(b, l + 1);
      if (!r) r = FunToString(b, l + 1);
      if (!r) r = FunToNumber(b, l + 1);
      if (!r) r = FunToArray(b, l + 1);
      if (!r) r = FunToList(b, l + 1);
      if (!r) r = FunIsNull(b, l + 1);
      if (!r) r = FunIsBool(b, l + 1);
      if (!r) r = FunIsNumber(b, l + 1);
      if (!r) r = FunIsString(b, l + 1);
      if (!r) r = FunIsArray(b, l + 1);
      if (!r) r = FunIsList(b, l + 1);
      if (!r) r = FunIsObject(b, l + 1);
      if (!r) r = FunIsDocument(b, l + 1);
      if (!r) r = FunIsDateString(b, l + 1);
      if (!r) r = FunIsKey(b, l + 1);
      if (!r) r = FunTypename(b, l + 1);
      if (!r) r = FunAsin(b, l + 1);
      if (!r) r = FunAvg(b, l + 1);
      if (!r) r = FunAverage(b, l + 1);
      if (!r) r = FunTan(b, l + 1);
      if (!r) r = FunTan2(b, l + 1);
      if (!r) r = FunAtan(b, l + 1);
      if (!r) r = FunSin(b, l + 1);
      if (!r) r = FunAtan2(b, l + 1);
      if (!r) r = FunCos(b, l + 1);
      if (!r) r = FunDegrees(b, l + 1);
      if (!r) r = FunMin(b, l + 1);
      if (!r) r = FunPosition(b, l + 1);
      if (!r) r = FunContainsArray(b, l + 1);
      if (!r) r = FunAppend(b, l + 1);
      if (!r) r = FunLength(b, l + 1);
      if (!r) r = FunCount(b, l + 1);
      if (!r) r = FunCountDistinct(b, l + 1);
      if (!r) r = FunCountUnique(b, l + 1);
      if (!r) r = FunFirst(b, l + 1);
      if (!r) r = FunLast(b, l + 1);
      if (!r) r = FunFlatten(b, l + 1);
      if (!r) r = FunInterSection(b, l + 1);
      if (!r) r = FunMinus(b, l + 1);
      if (!r) r = FunNTH(b, l + 1);
      if (!r) r = FunRemoveNTH(b, l + 1);
      if (!r) r = FunOuterSection(b, l + 1);
      if (!r) r = FunRemoveValue(b, l + 1);
      if (!r) r = FunPop(b, l + 1);
      if (!r) r = FunRemoveValues(b, l + 1);
      if (!r) r = FunPush(b, l + 1);
      if (!r) r = FunReverse(b, l + 1);
      if (!r) r = FunShift(b, l + 1);
      if (!r) r = FunSlice(b, l + 1);
      if (!r) r = FunSorted(b, l + 1);
      if (!r) r = FunSortedUnique(b, l + 1);
      if (!r) r = FunUnion(b, l + 1);
      if (!r) r = FunUnionDistinct(b, l + 1);
      if (!r) r = FunUnique(b, l + 1);
      if (!r) r = FunUnShift(b, l + 1);
      if (!r) r = FunMedian(b, l + 1);
      if (!r) r = FunLog10(b, l + 1);
      if (!r) r = FunMax(b, l + 1);
      if (!r) r = FunSQRT(b, l + 1);
      if (!r) r = FunPercentile(b, l + 1);
      if (!r) r = FunPi(b, l + 1);
      if (!r) r = FunLog2(b, l + 1);
      if (!r) r = FunLog(b, l + 1);
      if (!r) r = FunFloor(b, l + 1);
      if (!r) r = FunExp2(b, l + 1);
      if (!r) r = FunExp(b, l + 1);
      if (!r) r = FunCeil(b, l + 1);
      if (!r) r = FunRand(b, l + 1);
      if (!r) r = FunSum(b, l + 1);
      if (!r) r = FunStddev(b, l + 1);
      if (!r) r = FunPow(b, l + 1);
      if (!r) r = FunVarianceSample(b, l + 1);
      if (!r) r = FunStddevPopulation(b, l + 1);
      if (!r) r = FunVariancePopulation(b, l + 1);
      if (!r) r = FunRadians(b, l + 1);
      if (!r) r = FunRange(b, l + 1);
      if (!r) r = FunRound(b, l + 1);
      if (!r) r = FunVariance(b, l + 1);
      if (!r) r = FunConcatSeparator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeywordFunctions
  public static boolean NamedKeywordFunctions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedKeywordFunctions")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_KEYWORD_FUNCTIONS, "<named keyword functions>");
    r = KeywordFunctions(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KeywordStatements
  public static boolean NamedKeywordStatements(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "NamedKeywordStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_KEYWORD_STATEMENTS, "<named keyword statements>");
    r = KeywordStatements(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AnyNumber | SignedInteger | IntegerType
  public static boolean NumberType(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "NumberType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMBER_TYPE, "<number type>");
    r = AnyNumber(b, l + 1);
      if (!r) r = SignedInteger(b, l + 1);
      if (!r) r = IntegerType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PropertyName (property_lookup)*
  public static boolean ObjectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression")) return false;
      if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PropertyName(b, l + 1);
    r = r && ObjectExpression_1(b, l + 1);
    exit_section_(b, m, OBJECT_EXPRESSION, r);
    return r;
  }

    // (property_lookup)*
  private static boolean ObjectExpression_1(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ObjectExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
        if (!ObjectExpression_1_0(b, l + 1)) break;
        if (!empty_element_parsed_guard_(b, "ObjectExpression_1", c)) break;
    }
    return true;
  }

    // (property_lookup)
  private static boolean ObjectExpression_1_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ObjectExpression_1_0")) return false;
      boolean r;
      Marker m = enter_section_(b);
      r = property_lookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // T_IS
  //                        | T_NOT
  //                        | T_AND
  //                        | T_LOGICAL_AND
  //                        | T_OR
  //                        | T_NIN
  //                        | T_REGEX_MATCH
  //                        | T_REGEX_NON_MATCH
  //                        | T_EQ
  //                        | T_NE
  //                        | T_LT
  //                        | T_GT
  //                        | T_LE
  //                        | T_GE
  //                        | T_LIKE
  //                        | T_QUESTION
  //                        | T_COLON
  //                        | T_SCOPE
  //                        | T_RANGE
  //                        //TODO remove
  //                       | T_COMMA
  //                       | T_OPEN
  //                        | T_CLOSE
  //                         //| T_OBJECT_OPEN
  //                      /*  | T_ARRAY_OPEN
  //                        | T_ARRAY_CLOSE*/
  //                        //| T_PLACHOLDER_START
  //                        //| T_OBJECT_CLOSE
  //                        | DOT
  public static boolean OperatorStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperatorStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_STATEMENTS, "<operator statements>");
    r = consumeToken(b, T_IS);
    if (!r) r = consumeToken(b, T_NOT);
    if (!r) r = consumeToken(b, T_AND);
    if (!r) r = consumeToken(b, T_LOGICAL_AND);
    if (!r) r = consumeToken(b, T_OR);
    if (!r) r = consumeToken(b, T_NIN);
    if (!r) r = consumeToken(b, T_REGEX_MATCH);
    if (!r) r = consumeToken(b, T_REGEX_NON_MATCH);
    if (!r) r = consumeToken(b, T_EQ);
    if (!r) r = consumeToken(b, T_NE);
    if (!r) r = consumeToken(b, T_LT);
    if (!r) r = consumeToken(b, T_GT);
    if (!r) r = consumeToken(b, T_LE);
    if (!r) r = consumeToken(b, T_GE);
    if (!r) r = consumeToken(b, T_LIKE);
    if (!r) r = consumeToken(b, T_QUESTION);
    if (!r) r = consumeToken(b, T_COLON);
    if (!r) r = consumeToken(b, T_SCOPE);
    if (!r) r = consumeToken(b, T_RANGE);
    if (!r) r = consumeToken(b, T_COMMA);
    if (!r) r = consumeToken(b, T_OPEN);
    if (!r) r = consumeToken(b, T_CLOSE);
      if (!r) r = consumeToken(b, DOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // N_AT  PropertyName
  public static boolean ParameterVariable(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ParameterVariable")) return false;
      if (!nextTokenIs(b, N_AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, N_AT);
    r = r && PropertyName(b, l + 1);
    exit_section_(b, m, PARAMETER_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // PropertyName | SystemProperty
  public static boolean PropertyLookup(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "PropertyLookup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY_LOOKUP, "<property lookup>");
    r = PropertyName(b, l + 1);
      if (!r) r = SystemProperty(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean PropertyName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropertyName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, PROPERTY_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> Statement
  public static boolean QueryItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, QUERY_ITEM, "<query item>");
    r = QueryItem_0(b, l + 1);
    p = r; // pin = 1
    r = r && Statement(b, l + 1);
    exit_section_(b, l, m, r, p, statement_recover_parser_);
    return r || p;
  }

  // !<<eof>>
  private static boolean QueryItem_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "QueryItem_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_NULL
  public static boolean ReservedWords(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "ReservedWords")) return false;
      if (!nextTokenIs(b, T_NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_NULL);
    exit_section_(b, m, RESERVED_WORDS, r);
    return r;
  }

  /* ********************************************************** */
  // IntegerType T_RANGE IntegerType
  public static boolean Sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sequence")) return false;
    if (!nextTokenIs(b, NUMBER_INTEGER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IntegerType(b, l + 1);
    r = r && consumeToken(b, T_RANGE);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, m, SEQUENCE, r);
    return r;
  }

  /* ********************************************************** */
  // (T_PLUS | T_MINUS) IntegerType
  public static boolean SignedInteger(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "SignedInteger")) return false;
      if (!nextTokenIs(b, "<signed integer>", T_MINUS, T_PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_INTEGER, "<signed integer>");
    r = SignedInteger_0(b, l + 1);
    r = r && IntegerType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // T_PLUS | T_MINUS
  private static boolean SignedInteger_0(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "SignedInteger_0")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
      if (!r) r = consumeToken(b, T_MINUS);
    return r;
  }

  /* ********************************************************** */
  // NamedKeywordStatements
  //               | OperatorStatements
  //               | Sequence
  //               | StringType
  //               | ArrayType
  //               | JsonType
  //               | NumberType
  //               | BooleanType
  //               | VariablePlaceHolder
  //               | FunctionExpression
  //               | ExpressionType
  //               | Comment
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = NamedKeywordStatements(b, l + 1);
      if (!r) r = OperatorStatements(b, l + 1);
      if (!r) r = Sequence(b, l + 1);
      if (!r) r = StringType(b, l + 1);
      if (!r) r = ArrayType(b, l + 1);
      if (!r) r = JsonType(b, l + 1);
      if (!r) r = NumberType(b, l + 1);
      if (!r) r = BooleanType(b, l + 1);
      if (!r) r = VariablePlaceHolder(b, l + 1);
      if (!r) r = FunctionExpression(b, l + 1);
      if (!r) r = ExpressionType(b, l + 1);
      if (!r) r = Comment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (TEXT_SINGLE) | (TEXT_DOUBLE)
  public static boolean StringType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringType")) return false;
    if (!nextTokenIs(b, "<string type>", TEXT_DOUBLE, TEXT_SINGLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_TYPE, "<string type>");
    r = consumeToken(b, TEXT_SINGLE);
    if (!r) r = consumeToken(b, TEXT_DOUBLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_KEY | T_ID  | T_SYS_FROM  | T_SYS_TO
  public static boolean SystemProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SystemProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYSTEM_PROPERTY, "<system property>");
    r = consumeToken(b, T_KEY);
    if (!r) r = consumeToken(b, T_ID);
    if (!r) r = consumeToken(b, T_SYS_FROM);
    if (!r) r = consumeToken(b, T_SYS_TO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // T_PLACHOLDER_START ObjectExpression T_OBJECT_CLOSE
  public static boolean VariablePlaceHolder(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "VariablePlaceHolder")) return false;
      if (!nextTokenIs(b, T_PLACHOLDER_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_PLACE_HOLDER, null);
      r = consumeToken(b, T_PLACHOLDER_START);
    r = r && ObjectExpression(b, l + 1);
    p = r; // pin = 2
    r = r && consumeToken(b, T_OBJECT_CLOSE);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // QueryItem *
  static boolean aql(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aql")) return false;
    while (true) {
      int c = current_position_(b);
      if (!QueryItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aql", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ExpressionArray (','|&']')
  static boolean array_element(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "array_element")) return false;
      boolean r, p;
      Marker m = enter_section_(b, l, _NONE_);
      r = ExpressionArray(b, l + 1);
      p = r; // pin = 1
      r = r && array_element_1(b, l + 1);
      exit_section_(b, l, m, r, p, not_bracket_or_next_value_parser_);
      return r || p;
  }

    // ','|&']'
    private static boolean array_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "array_element_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        if (!r) r = array_element_1_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // &']'
    private static boolean array_element_1_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "array_element_1_1")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _AND_);
        r = consumeToken(b, T_ARRAY_CLOSE);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // ObjectExpression | BooleanType | ParameterVariable | VariablePlaceHolder
    static boolean boolean_argument(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "boolean_argument")) return false;
        boolean r;
        r = ObjectExpression(b, l + 1);
        if (!r) r = BooleanType(b, l + 1);
        if (!r) r = ParameterVariable(b, l + 1);
        if (!r) r = VariablePlaceHolder(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // ObjectExpression | JsonType | ParameterVariable | VariablePlaceHolder
    static boolean document_argument(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "document_argument")) return false;
        boolean r;
        r = ObjectExpression(b, l + 1);
        if (!r) r = JsonType(b, l + 1);
        if (!r) r = ParameterVariable(b, l + 1);
        if (!r) r = VariablePlaceHolder(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // ObjectExpression | IntegerType | ParameterVariable | VariablePlaceHolder
    static boolean integer_argument(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "integer_argument")) return false;
        boolean r;
        r = ObjectExpression(b, l + 1);
        if (!r) r = IntegerType(b, l + 1);
        if (!r) r = ParameterVariable(b, l + 1);
        if (!r) r = VariablePlaceHolder(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // !('}'|ComplexJsonValue)
    static boolean not_brace_or_next_value(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "not_brace_or_next_value")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NOT_);
        r = !not_brace_or_next_value_0(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // '}'|ComplexJsonValue
    private static boolean not_brace_or_next_value_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "not_brace_or_next_value_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_OBJECT_CLOSE);
        if (!r) r = ComplexJsonValue(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // !(']'|ExpressionArray)
    static boolean not_bracket_or_next_value(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "not_bracket_or_next_value")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NOT_);
        r = !not_bracket_or_next_value_0(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // ']'|ExpressionArray
    private static boolean not_bracket_or_next_value_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "not_bracket_or_next_value_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_ARRAY_CLOSE);
        if (!r) r = ExpressionArray(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // NumberType | possible_number_array
  static boolean number_argument(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "number_argument")) return false;
    boolean r;
    r = NumberType(b, l + 1);
      if (!r) r = possible_number_array(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // possible_number_array | "[" number_argument (',' number_argument)* "]"
  static boolean number_argument_array(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "number_argument_array")) return false;
    boolean r;
    Marker m = enter_section_(b);
      r = possible_number_array(b, l + 1);
      if (!r) r = number_argument_array_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

    // "[" number_argument (',' number_argument)* "]"
  private static boolean number_argument_array_1(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "number_argument_array_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ARRAY_OPEN);
    r = r && number_argument(b, l + 1);
    r = r && number_argument_array_1_2(b, l + 1);
    r = r && consumeToken(b, T_ARRAY_CLOSE);
    exit_section_(b, m, null, r);
    return r;
  }

    // (',' number_argument)*
  private static boolean number_argument_array_1_2(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "number_argument_array_1_2")) return false;
      while (true) {
          int c = current_position_(b);
          if (!number_argument_array_1_2_0(b, l + 1)) break;
          if (!empty_element_parsed_guard_(b, "number_argument_array_1_2", c)) break;
      }
      return true;
  }

    // ',' number_argument
    private static boolean number_argument_array_1_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "number_argument_array_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && number_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

    /* ********************************************************** */
    // property (','|&'}')
    static boolean object_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "object_element")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_);
        r = property(b, l + 1);
        p = r; // pin = 1
        r = r && object_element_1(b, l + 1);
        exit_section_(b, l, m, r, p, not_brace_or_next_value_parser_);
        return r || p;
    }

    // ','|&'}'
    private static boolean object_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "object_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
        if (!r) r = object_element_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

    // &'}'
    private static boolean object_element_1_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "object_element_1_1")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _AND_);
        r = consumeToken(b, T_OBJECT_CLOSE);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

  /* ********************************************************** */
  // ObjectExpression  | ParameterVariable | VariablePlaceHolder
  static boolean objects_argument(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "objects_argument")) return false;
      boolean r;
      r = ObjectExpression(b, l + 1);
      if (!r) r = ParameterVariable(b, l + 1);
      if (!r) r = VariablePlaceHolder(b, l + 1);
      return r;
  }

    /* ********************************************************** */
    // ObjectExpression | PropertyName  | ParameterVariable | VariablePlaceHolder
  static boolean possible_array(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "possible_array")) return false;
      boolean r;
      r = ObjectExpression(b, l + 1);
      if (!r) r = PropertyName(b, l + 1);
      if (!r) r = ParameterVariable(b, l + 1);
      if (!r) r = VariablePlaceHolder(b, l + 1);
      return r;
  }

    /* ********************************************************** */
    // ObjectExpression | PropertyName  | ParameterVariable | VariablePlaceHolder
    static boolean possible_number_array(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "possible_number_array")) return false;
    boolean r;
    r = ObjectExpression(b, l + 1);
        if (!r) r = PropertyName(b, l + 1);
        if (!r) r = ParameterVariable(b, l + 1);
        if (!r) r = VariablePlaceHolder(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // property_name ":" ComplexJsonValue+
    static boolean property(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "property")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_);
        r = property_name(b, l + 1);
        p = r; // pin = 1
        r = r && report_error_(b, consumeToken(b, T_COLON));
        r = p && property_2(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // ComplexJsonValue+
    private static boolean property_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "property_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ComplexJsonValue(b, l + 1);
        while (r) {
            int c = current_position_(b);
            if (!ComplexJsonValue(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "property_2", c)) break;
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // DOT PropertyLookup
    static boolean property_lookup(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "property_lookup")) return false;
        if (!nextTokenIs(b, DOT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, DOT);
        r = r && PropertyLookup(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // objects_argument | StringType  | ArrayRef
    static boolean property_name(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "property_name")) return false;
        boolean r;
        r = objects_argument(b, l + 1);
        if (!r) r = StringType(b, l + 1);
        if (!r) r = ArrayRef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !(
  //                         Statement
  //                     )
  static boolean statement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statement_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //                         Statement
  //                     )
  private static boolean statement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ObjectExpression | StringType | ParameterVariable | VariablePlaceHolder
  static boolean string_argument(PsiBuilder b, int l) {
      if (!recursion_guard_(b, l, "string_argument")) return false;
      boolean r;
      r = ObjectExpression(b, l + 1);
      if (!r) r = StringType(b, l + 1);
      if (!r) r = ParameterVariable(b, l + 1);
      if (!r) r = VariablePlaceHolder(b, l + 1);
      return r;
  }

    /* ********************************************************** */
    // possible_array | string_array
    static boolean string_argument_array(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_argument_array")) return false;
        boolean r;
        r = possible_array(b, l + 1);
        if (!r) r = string_array(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // "[" StringType ("," StringType)* "]"
    static boolean string_array(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_array")) return false;
        if (!nextTokenIs(b, T_ARRAY_OPEN)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_ARRAY_OPEN);
        r = r && StringType(b, l + 1);
        r = r && string_array_2(b, l + 1);
        r = r && consumeToken(b, T_ARRAY_CLOSE);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," StringType)*
    private static boolean string_array_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_array_2")) return false;
        while (true) {
            int c = current_position_(b);
            if (!string_array_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "string_array_2", c)) break;
        }
        return true;
    }

    // "," StringType
    private static boolean string_array_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_array_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // StringType ("," StringType)*
    static boolean string_list(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_list")) return false;
        if (!nextTokenIs(b, "", TEXT_DOUBLE, TEXT_SINGLE)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = StringType(b, l + 1);
        r = r && string_list_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ("," StringType)*
    private static boolean string_list_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_list_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!string_list_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "string_list_1", c)) break;
        }
        return true;
    }

    // "," StringType
    private static boolean string_list_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_list_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, T_COMMA);
        r = r && StringType(b, l + 1);
        exit_section_(b, m, null, r);
    return r;
  }

    static final Parser not_brace_or_next_value_parser_ = new Parser() {
        public boolean parse(PsiBuilder b, int l) {
            return not_brace_or_next_value(b, l + 1);
        }
    };
    static final Parser not_bracket_or_next_value_parser_ = new Parser() {
        public boolean parse(PsiBuilder b, int l) {
            return not_bracket_or_next_value(b, l + 1);
        }
    };
  static final Parser statement_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return statement_recover(b, l + 1);
    }
  };
}
