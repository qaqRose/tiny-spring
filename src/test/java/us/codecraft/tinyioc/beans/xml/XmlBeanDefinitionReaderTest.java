package us.codecraft.tinyioc.beans.xml;

import org.junit.Assert;
import org.junit.Test;
import us.codecraft.tinyioc.beans.BeanDefinition;
import us.codecraft.tinyioc.beans.io.ResourceLoader;

import java.util.Map;
import java.util.Set;

/**
 * @author yihua.huang@dianping.com
 */
public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Set<Map.Entry<String, BeanDefinition>> entries = registry.entrySet();
		for (Map.Entry<String, BeanDefinition> entry : entries) {
			System.out.println(entry.getKey());
		}
		Assert.assertTrue(registry.size() > 0);
	}
}
