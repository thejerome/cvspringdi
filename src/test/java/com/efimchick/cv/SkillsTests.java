package com.efimchick.cv;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import jdk.nashorn.internal.ir.annotations.Immutable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Jerome on 12.06.2017.
 */

/**
 * <util:list id="langs" value-type="java.lang.String">

 </util:list>

 <util:list id="techs" value-type="java.lang.String">
 <value>JavaSE</value>
 <value>Spring</value>
 <value>JavaEE(servlets, JDBC, JSP, JSF, CDI, JPA)</value>
 </util:list>

 <util:list id="tools" value-type="java.lang.String">
 <value>JDK</value>
 <value>IntelliJ IDEA</value>
 <value>Eclipse</value>
 <value>Maven</value>
 <value>Ant</value>
 <value>PL/SQL Developer</value>
 <value>bash</value>
 <value>nginx</value>
 <value>Tomcat</value>
 </util:list>

 <util:list id="dbs" value-type="java.lang.String">
 <value>Oracle</value>
 <value>MySQL</value>
 </util:list>

 <util:list id="engLevel" value-type="java.lang.String">
 <value>upper intermediate</value>
 </util:list>

 <util:map id="skills" key-type="java.lang.String" value-type="java.util.List">
 <entry key="Programming/Markup Languages">
 <list value-type="java.lang.String">
 <value>Java</value>
 <value>SQL (PL/SQL)</value>
 <value>XML</value>
 <value>HTML/CSS/JS</value>
 </list>
 </entry>
 <entry key="Technologies" value-ref="techs"/>
 <entry key="Tools" value-ref="tools"/>
 <entry key="DB" value-ref="dbs"/>
 <entry key="English" value-ref="engLevel"/>
 </util:map>
 */

@RunWith(SpringRunner.class)
@ContextConfiguration("/skills.xml")
public class SkillsTests {

    @Resource
    private Map<String, List> skills;

    @Test
    public void testSkillsBeanExists(){
        assertNotNull(skills);
    }

    @Test
    public void testAllSkills(){

        Map<String, List<String>> expectedSkills = ImmutableMap.of(
                "Programming/Markup Languages",
                ImmutableList.of(
                        "Java", "SQL (PL/SQL)", "XML", "HTML/CSS/JS"
                ),
                "Technologies",
                ImmutableList.of(
                        "JavaSE", "Spring", "JavaEE(servlets, JDBC, JSP, JSF, CDI, JPA)"
                ),
                "Tools",
                ImmutableList.of(
                        "JDK", "IntelliJ IDEA", "Eclipse", "Maven", "Ant", "PL/SQL Developer", "bash", "nginx", "Tomcat"
                ),
                "DB",
                ImmutableList.of(
                        "Oracle", "MySQL"
                ),
                "English",
                ImmutableList.of(
                        "upper intermediate"
                )
        );

        assertEquals(expectedSkills, skills);

    }

}
