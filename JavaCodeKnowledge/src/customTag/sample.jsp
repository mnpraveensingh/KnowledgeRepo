// to use java function in jsp declared in tld file under WEB-INF folder
<%@ taglib prefix="functions" uri="http://example.com/functions"%>

// Except characters will replace everything from given string with passed argument
<c:set var="expectedResponseValue" value="${functions:replaceAll(expectedString,'[^A-Za-z]', '')}" />