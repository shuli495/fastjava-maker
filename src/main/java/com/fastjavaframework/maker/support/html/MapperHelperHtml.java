package com.fastjavaframework.maker.support.html;

/**
 * 类生成器html
 *
 * @author wangshuli
 */
public class MapperHelperHtml {
    public String html() {
        StringBuffer sb = new StringBuffer();
        String newLine = System.getProperty("line.separator");

        sb.append(newLine).append("<div class=\"infoPage\">")
        .append(newLine).append("	<div class=\"classInfo\">")
        .append(newLine).append("		<div class=\"title\">类信息</div>")
        .append(newLine).append("		<div class=\"content\">")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("			    <input type=\"radio\" checked=\"checked\" id=\"modelNew\" name=\"model\" value=\"new\" />覆盖模式&nbsp;&nbsp;")
        .append(newLine).append("			    <input type=\"radio\" id=\"modelAdd\" name=\"model\" value=\"add\" />增量模式")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"controllerChecked\" name=\"controllerChecked\" onclick=\"disPath(this);\">Controller：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">命名空间&nbsp;<input type=\"text\" id=\"controllerNameSpace\" name=\"controllerNameSpace\"/><input type=\"hidden\" id=\"ansHiden\" name=\"ansHiden\"/></div>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"controllerPath\" name=\"controllerPath\"/><input type=\"hidden\" id=\"cpHiden\" name=\"cpHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"serviceChecked\" name=\"serviceChecked\" onclick=\"disPath(this);\">Service：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">命名空间&nbsp;<input type=\"text\" id=\"serviceNameSpace\" name=\"serviceNameSpace\"/><input type=\"hidden\" id=\"snsHiden\" name=\"snsHiden\"/></div>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"servicePath\" name=\"servicePath\"/><input type=\"hidden\" id=\"spHiden\" name=\"spHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"daoChecked\" name=\"daoChecked\" onclick=\"disPath(this);\">Dao：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">命名空间&nbsp;<input type=\"text\" id=\"daoNameSpace\" name=\"daoNameSpace\"/><input type=\"hidden\" id=\"dnsHiden\" name=\"dnsHiden\"/></div>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"daoPath\" name=\"daoPath\"/><input type=\"hidden\" id=\"dpHiden\" name=\"dpHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"boChecked\" name=\"boChecked\" onclick=\"disPath(this);\">BO：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">命名空间&nbsp;<input type=\"text\" id=\"boNameSpace\" name=\"boNameSpace\"/><input type=\"hidden\" id=\"bnsHiden\" name=\"bnsHiden\"/></div>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"boPath\" name=\"boPath\"/><input type=\"hidden\" id=\"bpHiden\" name=\"bpHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"voChecked\" name=\"voChecked\" onclick=\"disPath(this);\">VO：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">命名空间&nbsp;<input type=\"text\" id=\"voNameSpace\" name=\"voNameSpace\"/><input type=\"hidden\" id=\"vnsHiden\" name=\"vnsHiden\"/></div>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"voPath\" name=\"voPath\"/><input type=\"hidden\" id=\"vpHiden\" name=\"vpHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"mapperChecked\" name=\"mapperChecked\" onclick=\"disPath(this);\">MapperXML：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"mapperPath\" name=\"mapperPath\"/><input type=\"hidden\" id=\"mpHiden\" name=\"mpHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"classDiv\">")
        .append(newLine).append("				<input type=\"checkbox\" id=\"validationChecked\" name=\"validationChecked\" onclick=\"disPath(this);\">ValidationMessages.properties：</br>")
        .append(newLine).append("				<div class=\"inputDiv\">文件路径&nbsp;<input type=\"text\" id=\"validationMessagesPath\" name=\"validationMessagesPath\"/><input type=\"hidden\" id=\"vmpHiden\" name=\"vmpHiden\"/></div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"subButDiv\">")
        .append(newLine).append("				<button id=\"makeBut\" onclick=\"setChkVal();doFastJava('mapperHelper_createFile')\" >生成</button>")
        .append(newLine).append("			</div>")
        .append(newLine).append("		</div>")
        .append(newLine).append("	</div>")
        .append(newLine).append("")
        .append(newLine).append("	<div class=\"tableInfo\">")
        .append(newLine).append("		<div class=\"title\">表信息</div>")
        .append(newLine).append("		<div class=\"content\">")
        .append(newLine).append("			<input type=\"hidden\" id=\"tableInfos\" name=\"tableInfos\"/>")
        .append(newLine).append("			<div class=\"tableSearch\">")
        .append(newLine).append("				表名&nbsp;<input type=\"text\" id=\"selTableByName\" name=\"selTableByName\" oninput=\"selectByName(this.value);\"/>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div class=\"tableTilte\">")
        .append(newLine).append("				<div class=\"tableChk\"><input type=\"checkbox\" id=\"checkAll\" name=\"checkAll\" onclick=\"checkTableAll(this)\"></div>")
        .append(newLine).append("				<div class=\"tableTitle tableNameWidth\">表名</div>")
        .append(newLine).append("				<div class=\"tableTitle tableDelWidth\">创建时间</div>")
        .append(newLine).append("				<div class=\"tableTitle tableDelWidth\">修改时间</div>")
        .append(newLine).append("				<div class=\"tableTitle tableDelWidth\">删除字段</div>")
        .append(newLine).append("				<div class=\"tableTitle tableDelWidth\">删除时间</div>")
        .append(newLine).append("			</div>")
        .append(newLine).append("			<div id=\"tableCheck\"></div>")
        .append(newLine).append("		</div>")
        .append(newLine).append("	</div>")
        .append(newLine).append("</div>")
        .append(newLine).append("")
        .append(newLine).append("<script>")
        .append(newLine).append("var tableInfos;")
        .append(newLine).append("var selTableByName;")
        .append(newLine).append("var checkAll;")
        .append(newLine).append("var model;")
        .append(newLine).append("var controllerChecked;")
        .append(newLine).append("var controllerNameSpace;")
        .append(newLine).append("var controllerPath;")
        .append(newLine).append("var serviceChecked;")
        .append(newLine).append("var serviceNameSpace;")
        .append(newLine).append("var servicePath;")
        .append(newLine).append("var daoChecked;")
        .append(newLine).append("var daoNameSpace;")
        .append(newLine).append("var daoPath;")
        .append(newLine).append("var boChecked;")
        .append(newLine).append("var boNameSpace;")
        .append(newLine).append("var boPath;")
        .append(newLine).append("var voChecked;")
        .append(newLine).append("var voNameSpace;")
        .append(newLine).append("var voPath;")
        .append(newLine).append("var mapperChecked;")
        .append(newLine).append("var mapperPath;")
        .append(newLine).append("var validationChecked;")
        .append(newLine).append("var validationMessagesPath;")
        .append(newLine).append("var ansHiden;")
        .append(newLine).append("var cpHiden;")
        .append(newLine).append("var snsHiden;")
        .append(newLine).append("var spHiden;")
        .append(newLine).append("var dnsHiden;")
        .append(newLine).append("var dpHiden;")
        .append(newLine).append("var bnsHiden;")
        .append(newLine).append("var bpHiden;")
        .append(newLine).append("var vnsHiden;")
        .append(newLine).append("var vpHiden;")
        .append(newLine).append("var mpHiden;")
        .append(newLine).append("var vmpHiden;")
        .append(newLine).append("")
        .append(newLine).append("function onloadFunction() {")
        .append(newLine).append("	document.getElementById(\"selTableByName\").value = typeof(selTableByName)==\"undefined\"?\"\":selTableByName;")
        .append(newLine).append("	document.getElementById(\"checkAll\").checked = typeof(checkAll)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"modelAdd\").checked = model==\"add\"?true:false;")
        .append(newLine).append("	document.getElementById(\"controllerChecked\").checked = typeof(controllerChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"controllerNameSpace\").value = typeof(controllerNameSpace)==\"undefined\"?\"\":controllerNameSpace;")
        .append(newLine).append("	document.getElementById(\"controllerPath\").value = typeof(controllerPath)==\"undefined\"?\"\":controllerPath;")
        .append(newLine).append("	document.getElementById(\"serviceChecked\").checked = typeof(serviceChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"serviceNameSpace\").value = typeof(serviceNameSpace)==\"undefined\"?\"\":serviceNameSpace;")
        .append(newLine).append("	document.getElementById(\"servicePath\").value = typeof(servicePath)==\"undefined\"?\"\":servicePath;")
        .append(newLine).append("	document.getElementById(\"daoChecked\").checked = typeof(daoChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"daoNameSpace\").value = typeof(daoNameSpace)==\"undefined\"?\"\":daoNameSpace;")
        .append(newLine).append("	document.getElementById(\"daoPath\").value = typeof(daoPath)==\"undefined\"?\"\":daoPath;")
        .append(newLine).append("	document.getElementById(\"boChecked\").checked = typeof(boChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"boNameSpace\").value = typeof(boNameSpace)==\"undefined\"?\"\":boNameSpace;")
        .append(newLine).append("	document.getElementById(\"boPath\").value = typeof(boPath)==\"undefined\"?\"\":boPath;")
        .append(newLine).append("	document.getElementById(\"voChecked\").checked = typeof(voChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"voNameSpace\").value = typeof(voNameSpace)==\"undefined\"?\"\":voNameSpace;")
        .append(newLine).append("	document.getElementById(\"voPath\").value = typeof(voPath)==\"undefined\"?\"\":voPath;")
        .append(newLine).append("	document.getElementById(\"mapperChecked\").checked = typeof(mapperChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"mapperPath\").value = typeof(mapperPath)==\"undefined\"?\"\":mapperPath;")
        .append(newLine).append("	document.getElementById(\"validationChecked\").checked = typeof(validationChecked)==\"undefined\"?false:true;")
        .append(newLine).append("	document.getElementById(\"validationMessagesPath\").value = typeof(validationMessagesPath)==\"undefined\"?\"\":validationMessagesPath;")
        .append(newLine).append("	document.getElementById(\"ansHiden\").value = typeof(ansHiden)==\"undefined\"?\"\":ansHiden;")
        .append(newLine).append("	document.getElementById(\"cpHiden\").value = typeof(cpHiden)==\"undefined\"?\"\":cpHiden;")
        .append(newLine).append("	document.getElementById(\"snsHiden\").value = typeof(snsHiden)==\"undefined\"?\"\":snsHiden;")
        .append(newLine).append("	document.getElementById(\"spHiden\").value = typeof(spHiden)==\"undefined\"?\"\":spHiden;")
        .append(newLine).append("	document.getElementById(\"dnsHiden\").value = typeof(dnsHiden)==\"undefined\"?\"\":dnsHiden;")
        .append(newLine).append("	document.getElementById(\"dpHiden\").value = typeof(dpHiden)==\"undefined\"?\"\":dpHiden;")
        .append(newLine).append("	document.getElementById(\"bnsHiden\").value = typeof(bnsHiden)==\"undefined\"?\"\":bnsHiden;")
        .append(newLine).append("	document.getElementById(\"bpHiden\").value = typeof(bpHiden)==\"undefined\"?\"\":bpHiden;")
        .append(newLine).append("	document.getElementById(\"vnsHiden\").value = typeof(vnsHiden)==\"undefined\"?\"\":vnsHiden;")
        .append(newLine).append("	document.getElementById(\"vpHiden\").value = typeof(vpHiden)==\"undefined\"?\"\":vpHiden;")
        .append(newLine).append("	document.getElementById(\"mpHiden\").value = typeof(mpHiden)==\"undefined\"?\"\":mpHiden;")
        .append(newLine).append("	document.getElementById(\"vmpHiden\").value = typeof(vmpHiden)==\"undefined\"?\"\":vmpHiden;")
        .append(newLine).append("")
        .append(newLine).append("   //用隐藏域的值回填text")
        .append(newLine).append("   hidenToVal(document.getElementById(\"controllerChecked\"));")
        .append(newLine).append("   hidenToVal(document.getElementById(\"serviceChecked\"));")
        .append(newLine).append("   hidenToVal(document.getElementById(\"daoChecked\"));")
        .append(newLine).append("   hidenToVal(document.getElementById(\"boChecked\"));")
        .append(newLine).append("   hidenToVal(document.getElementById(\"voChecked\"));")
        .append(newLine).append("   hidenToVal(document.getElementById(\"mapperChecked\"));")
        .append(newLine).append("   hidenToVal(document.getElementById(\"validationChecked\"));")
        .append(newLine).append("")
        .append(newLine).append("	var divs = \"\";")
        .append(newLine).append("	var tableInfoStr = \"[\";")
        .append(newLine).append("	for(var i=0; i<tableInfos.length; i++) {")
        .append(newLine).append("		var checked = \"\";")
        .append(newLine).append("		if(tableInfos[i][0] == true) {")
        .append(newLine).append("			checked = \"checked\";")
        .append(newLine).append("		}")
        .append(newLine).append("		var table = tableInfos[i][1].split(\"&\");")
        .append(newLine).append("		divs += \"<div class='tableRow'>\"")
        .append(newLine).append("			  + \"<div class='tableChk'><input type='checkbox' name='tableChked' value='\"+table[0]+\"&\"+table[1]+\"&\"+table[2]+\"&\"+table[3]+\"&\"+table[4]+\"' \"+checked+\"/></div>\"")
        .append(newLine).append("			  + \"<div class='tableRowDiv tableName tableNameWidth'>\"+table[0]+\"</div>\"")
        .append(newLine).append("			  + \"<div class='tableRowDiv tableDel tableDelWidth'><input value='\" + table[1] + \"'/></div>\"")
        .append(newLine).append("			  + \"<div class='tableRowDiv tableDel tableDelWidth'><input value='\" + table[2] + \"'/></div>\"")
        .append(newLine).append("			  + \"<div class='tableRowDiv tableDel tableDelWidth'><input value='\" + table[3] + \"'/></div>\"")
        .append(newLine).append("			  + \"<div class='tableRowDiv tableDel tableDelWidth'><input value='\" + table[4] + \"'/></div>\"")
        .append(newLine).append("			  + \"</div>\";")
        .append(newLine).append("		")
        .append(newLine).append("	    if(tableInfoStr != \"[\") {")
        .append(newLine).append("	    	tableInfoStr += \",\";")
        .append(newLine).append("	    }")
        .append(newLine).append("		tableInfoStr += \"[\" + tableInfos[i][0] + \",'\" + table[0] + \"&\" + table[1] + \"&\" + table[2] + \"']\";")
        .append(newLine).append("	}")
        .append(newLine).append("	")
        .append(newLine).append("	document.getElementById(\"tableInfos\").value = tableInfoStr + \"]\";")
        .append(newLine).append("	document.getElementById(\"tableCheck\").innerHTML = divs;")
        .append(newLine).append("	selectByName(selTableByName);")
        .append(newLine).append("}")
        .append(newLine).append("")
        .append(newLine).append("//读取项目路径")
        .append(newLine).append("function readPath() {")
        .append(newLine).append("	setChkVal();	//设置checkbox值")
        .append(newLine).append("	doFastJava('mapperHelper_readPath'); //读取项目路径")
        .append(newLine).append("	document.getElementById(\"controllerChecked\").checked = true;")
        .append(newLine).append("	document.getElementById(\"serviceChecked\").checked = true;")
        .append(newLine).append("	document.getElementById(\"daoChecked\").checked = true;")
        .append(newLine).append("	document.getElementById(\"boChecked\").checked = true;")
        .append(newLine).append("	document.getElementById(\"voChecked\").checked = true;")
        .append(newLine).append("	document.getElementById(\"mapperChecked\").checked = true;")
        .append(newLine).append("	document.getElementById(\"validationChecked\").checked = true;")
        .append(newLine).append("}")
        .append(newLine).append("")
        .append(newLine).append("//全选")
        .append(newLine).append("function checkTableAll(obj) {")
        .append(newLine).append("	obj.value = obj.checked;")
        .append(newLine).append("	var checkboxs = document.getElementsByName('tableChked');")
        .append(newLine).append("	for(i=0; i<checkboxs.length; i++) {")
        .append(newLine).append("		checkboxs[i].checked = obj.checked;")
        .append(newLine).append("	}")
        .append(newLine).append("}")
        .append(newLine).append("")
        .append(newLine).append("//按name搜索table")
        .append(newLine).append("function selectByName(val) {")
        .append(newLine).append("	if(typeof(val) == \"undefined\" || val == \"\") {")
        .append(newLine).append("		return;")
        .append(newLine).append("	}")
        .append(newLine).append("	")
        .append(newLine).append("	var tableChecks = document.getElementById(\"tableCheck\").childNodes;")
        .append(newLine).append("	for(i=0; i<tableChecks.length; i++) {")
        .append(newLine).append("		var tableName = tableChecks[i].childNodes[1].innerHTML;")
        .append(newLine).append("		if(tableName.indexOf(val) == -1) {")
        .append(newLine).append("			tableChecks[i].style.display = \"none\";")
        .append(newLine).append("		} else {")
        .append(newLine).append("			tableChecks[i].style.display = \"\";")
        .append(newLine).append("		}")
        .append(newLine).append("	}")
        .append(newLine).append("}")
        .append(newLine).append("")
        .append(newLine).append("//设置表checkBox的value信息，后台生成类用，每个走后台事件调用")
        .append(newLine).append("function setChkVal() {")
        .append(newLine).append("	document.getElementById(\"ansHiden\").value = document.getElementById(\"controllerNameSpace\").value;")
        .append(newLine).append("	document.getElementById(\"cpHiden\").value = document.getElementById(\"controllerPath\").value;")
        .append(newLine).append("	document.getElementById(\"snsHiden\").value = document.getElementById(\"serviceNameSpace\").value;")
        .append(newLine).append("	document.getElementById(\"spHiden\").value = document.getElementById(\"servicePath\").value;")
        .append(newLine).append("	document.getElementById(\"dnsHiden\").value = document.getElementById(\"daoNameSpace\").value;")
        .append(newLine).append("	document.getElementById(\"dpHiden\").value = document.getElementById(\"daoPath\").value;")
        .append(newLine).append("	document.getElementById(\"bnsHiden\").value = document.getElementById(\"boNameSpace\").value;")
        .append(newLine).append("	document.getElementById(\"bpHiden\").value = document.getElementById(\"boPath\").value;")
        .append(newLine).append("	document.getElementById(\"vnsHiden\").value = document.getElementById(\"voNameSpace\").value;")
        .append(newLine).append("	document.getElementById(\"vpHiden\").value = document.getElementById(\"voPath\").value;")
        .append(newLine).append("	document.getElementById(\"mpHiden\").value = document.getElementById(\"mapperPath\").value;")
        .append(newLine).append("	document.getElementById(\"vmpHiden\").value = document.getElementById(\"validationMessagesPath\").value;")
        .append(newLine).append("")
        .append(newLine).append("	var tableInfoStr = \"[\";")
        .append(newLine).append("	var tableChecks = document.getElementById(\"tableCheck\").childNodes;")
        .append(newLine).append("	for(i=0; i<tableChecks.length; i++) {")
        .append(newLine).append("		var isChecked = tableChecks[i].childNodes[0].childNodes[0].checked;")
        .append(newLine).append("		var tableName = tableChecks[i].childNodes[1].innerHTML;")
        .append(newLine).append("		var createTimeCol = tableChecks[i].childNodes[2].childNodes[0].value;")
        .append(newLine).append("		var updateTimeCol = tableChecks[i].childNodes[3].childNodes[0].value;")
        .append(newLine).append("		var delColumn = tableChecks[i].childNodes[4].childNodes[0].value;")
        .append(newLine).append("		var delTimeCol = tableChecks[i].childNodes[5].childNodes[0].value;")
        .append(newLine).append("")
        .append(newLine).append("	    if(tableInfoStr != \"[\") {")
        .append(newLine).append("	    	tableInfoStr += \",\";")
        .append(newLine).append("	    }")
        .append(newLine).append("		tableInfoStr += \"[\" + isChecked + \",'\" + tableName + \"&\" + createTimeCol + \"&\" + updateTimeCol + \"&\" + delColumn + \"&\" + delTimeCol + \"']\";")
        .append(newLine).append("	}")
        .append(newLine).append("")
        .append(newLine).append("	//替换表信息隐藏域是否选中的值")
        .append(newLine).append("	document.getElementById(\"tableInfos\").value = tableInfoStr + \"]\";")
        .append(newLine).append("}")
        .append(newLine).append("//disable后值无法带回，用隐藏域的值回填text")
        .append(newLine).append("function hidenToVal(obj) {")
        .append(newLine).append("    var inputs = obj.parentNode.getElementsByTagName(\"input\");")
        .append(newLine).append("    for(var i=0; i<inputs.length; i++) {")
        .append(newLine).append("        if(inputs[i].type == \"text\"&& inputs[i].value == '') {")
        .append(newLine).append("           inputs[i].value = inputs[i].nextSibling.value")
        .append(newLine).append("        }")
        .append(newLine).append("    }")
        .append(newLine).append("    this.disPath(obj);")
        .append(newLine).append("}")
        .append(newLine).append("//设置各个层是否可用")
        .append(newLine).append("function disPath(obj) {")
        .append(newLine).append("    var isMake = !obj.checked;")
        .append(newLine).append("    var inputs = obj.parentNode.getElementsByTagName(\"input\");")
        .append(newLine).append("    for(var i=0; i<inputs.length; i++) {")
        .append(newLine).append("        if(inputs[i].type == \"text\" && inputs[i].id.indexOf(\"NameSpace\") == -1) {")
        .append(newLine).append("            inputs[i].disabled = isMake;")
        .append(newLine).append("        }")
        .append(newLine).append("    }")
        .append(newLine).append("}")
        .append(newLine).append("</script>")
        .append(newLine).append("")
        .append(newLine).append("<style>")
        .append(newLine).append(".infoPage {")
        .append(newLine).append("	margin-left: auto;")
        .append(newLine).append("	margin-right:auto;")
        .append(newLine).append("	width:1070px;")
        .append(newLine).append("}")
        .append(newLine).append(".classInfo {")
        .append(newLine).append("	width:520px;")
        .append(newLine).append("	float:left;")
        .append(newLine).append("	display:inline;")
        .append(newLine).append("	position:initial;")
        .append(newLine).append("}")
        .append(newLine).append(".tableInfo {")
        .append(newLine).append("	width:530px;")
        .append(newLine).append("	float:left;")
        .append(newLine).append("	display:inline;")
        .append(newLine).append("	margin-left:20px;")
        .append(newLine).append("}")
        .append(newLine).append(".title {")
        .append(newLine).append("	background-color: white;")
        .append(newLine).append("	height:40px;")
        .append(newLine).append("	line-height:40px;")
        .append(newLine).append("	border-bottom:1px solid rgba(0,0,0,.15);")
        .append(newLine).append("	padding-left:10px;")
        .append(newLine).append("	font-size:16px;")
        .append(newLine).append("	color:grey;")
        .append(newLine).append("}")
        .append(newLine).append(".content {")
        .append(newLine).append("	background-color: white;")
        .append(newLine).append("	height:700px;")
        .append(newLine).append("	color:#4E4E4E;")
        .append(newLine).append("}")
        .append(newLine).append(".tableSearch {")
        .append(newLine).append("	clear:both;")
        .append(newLine).append("	padding-top:22px;")
        .append(newLine).append("	padding-left:15px;")
        .append(newLine).append("}")
        .append(newLine).append(".tableTilte {")
        .append(newLine).append("	clear:both;")
        .append(newLine).append("	padding-top:10px;")
        .append(newLine).append("	padding-left:15px;")
        .append(newLine).append("	padding-right:15px;")
        .append(newLine).append("}")
        .append(newLine).append("#tableCheck {")
        .append(newLine).append("	clear:both;")
        .append(newLine).append("	height:408px;")
        .append(newLine).append("	overflow:auto;")
        .append(newLine).append("	padding-left:15px;")
        .append(newLine).append("	padding-right:15px;")
        .append(newLine).append("}")
        .append(newLine).append(".tableRow {")
        .append(newLine).append("	clear:both;")
        .append(newLine).append("	padding-top:5px;")
        .append(newLine).append("}")
        .append(newLine).append(".tableChk {")
        .append(newLine).append("	float:left;")
        .append(newLine).append("	display:inline;")
        .append(newLine).append("	width:5%;")
        .append(newLine).append("    padding-bottom: 4px;")
        .append(newLine).append("}")
        .append(newLine).append(".tableTitle {")
        .append(newLine).append("	float:left;")
        .append(newLine).append("	display:inline;")
        .append(newLine).append("	width:30%;")
        .append(newLine).append("	text-align:center;")
        .append(newLine).append("}")
        .append(newLine).append(".tableNameWidth {")
        .append(newLine).append("	width:25%;")
        .append(newLine).append("	padding-left:1%;")
        .append(newLine).append("}")
        .append(newLine).append(".tableDelWidth {")
        .append(newLine).append("	width:17%;")
        .append(newLine).append("}")
        .append(newLine).append(".tableRowDiv {")
        .append(newLine).append("	float:left;")
        .append(newLine).append("	display:inline;")
        .append(newLine).append("	border-bottom:1px solid rgba(0,0,0,.15);")
        .append(newLine).append("}")
        .append(newLine).append(".tableName {")
        .append(newLine).append("    padding-bottom: 4px;")
        .append(newLine).append("}")
        .append(newLine).append(".tableDel {")
        .append(newLine).append("	text-align:center;")
        .append(newLine).append("    padding-bottom: 2px;")
        .append(newLine).append("}")
        .append(newLine).append(".tableDel>input {")
        .append(newLine).append("	width:70px;")
        .append(newLine).append("}")
        .append(newLine).append(".classDiv {")
        .append(newLine).append("	padding-top:20px;")
        .append(newLine).append("	padding-left:15px;")
        .append(newLine).append("}")
        .append(newLine).append(".classChkDiv {")
        .append(newLine).append("	vertical-align:middle")
        .append(newLine).append("}")
        .append(newLine).append(".inputDiv {")
        .append(newLine).append("	padding-top:2px;")
        .append(newLine).append("}")
        .append(newLine).append(".inputDiv>input {")
        .append(newLine).append("	width:410px;")
        .append(newLine).append("}")
        .append(newLine).append(".subButDiv {")
        .append(newLine).append("	padding-top:25px;")
        .append(newLine).append("	padding-bottom:10px;")
        .append(newLine).append("	text-align:center;")
        .append(newLine).append("}")
        .append(newLine).append(".subButDiv>button {")
        .append(newLine).append("	width:80px;")
        .append(newLine).append("	font-family:Microsoft Yahei,Helvetica Neue,Hiragino Sans GB,WenQuanYi Micro Hei,sans-serif;")
        .append(newLine).append("}")
        .append(newLine).append("</style>");

        return sb.toString();
    }
}
