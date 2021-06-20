package Factory_method_pattern;
import java.io.File;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class XMLUtil {

	public static Object getBean() {
		try {
		//创建DOM文档对象
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=dFactory.newDocumentBuilder();
		Document doc;
		doc = builder.parse(new File("config.xml"));
		
		//获取包含类名的文本节点
		NodeList nl = doc.getElementsByTagName("className");
		Node classNode=nl.item(0).getFirstChild();
		String cName=classNode.getNodeValue();
		
		//通过类名生成实例对象并将其返回
		String []a = XMLUtil.class.getPackage().toString().split(" ");
		Class c = Class.forName(a[1] + "." + cName);
		Object obj = c.newInstance();
		return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
