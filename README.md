# Examples of custom AssertJ mixins including generated assertions
## A "Hello World" for using AssertJ custom assertions via a mixin

Requires Java 8


##What you can learn here

[EmployeeTest.java] (https://github.com/aro-tech/template-example/blob/master/src/test/java/org/example/test/EmployeeTest.java) is an example of a test class using test fixture mixins, including custom-generated AssertJ assertions.

With the maven command `mvn assertj:generate-assertions` you can generate custom assertions for the example JavaBeans. That's how classes here like [EmployeeAssert] (https://github.com/aro-tech/template-example/blob/master/src/test/java/org/example/EmployeeAssert.java) were generated automatically.

In the src/test/resources directory there are custom templates for the generation of these assertions which allow extra fluidity. 

Note that the generated standard endpoint [Assertions.java] (https://github.com/aro-tech/template-example/blob/master/src/test/java/org/example/assertions/generated/Assertions.java) is not a class but a mixin interface.  The advantage of this is that no static imports are necessary, and you can build up test fixture capabilities by subtyping/subclassing. The generated standard endpoint `Assertions.java` is an example of a test fixture built up by subtyping/subclassing using mixins - it extends AllAssertions from my [tdd-mixins-junit4 project] (https://github.com/aro-tech/tdd-mixins-junit4).

Unfortunately, for now ([known issue] (https://github.com/joel-costigliola/assertj-assertions-generator/issues/65)), the AssertJ assertions generator does not allow renaming of the standard endpoint class, which is why EmployeeTest is defined using `implements org.example.assertions.generated.Assertions` instead of something like `implements CustomAssertionsMixin`. There are other classes named "Assertions", so I felt the need to use the fully qualified name for clarity.

## How the mixin is generated

The [pom.xml] (https://github.com/aro-tech/template-example/blob/master/pom.xml) contains the plugin "assertj-assertions-generator-maven-plugin" (which allows us, as mentioned above, to call maven with the goal `assertj:generate-assertions`) and configures it to specify which JavaBeans to target and which template files to override.

The customized template files are in [src/test/resources/templates/] (https://github.com/aro-tech/template-example/tree/master/src/test/resources/templates) 

The template [*my_assertions_entry_point_class_template.txt*] (https://github.com/aro-tech/template-example/tree/master/src/test/resources/templates/my_assertions_entry_point_class_template.txt) defines Assertions not as a class but as an interface (and one which extends mixins for standard AssertJ and JUnit assertions from tdd-mixins-junit4.

The template [*my_assertions_entry_point_method_template.txt*] (https://github.com/aro-tech/template-example/tree/master/src/test/resources/templates/my_assertions_entry_point_method_template.txt) defines each method of Assertions as a default method rather than a public static method.

# Added goodies

The template [*my_has_assertion_template.txt*] (https://github.com/aro-tech/template-example/tree/master/src/test/resources/templates/my_has_assertion_template.txt) defines additional methods which are more useful for the case where a member object of the asserted JavaBean is also a JavaBean.  

I added method templates to generate methods like `hasEmployerMatching` which lets you match with a lambda instead of having to match against an object which is equal to the `Employer`. 

I also added a method to allow switching from the target JavaBean's assertion (e.g. EmployeeAssert) to a StringAssert on the toString() of the member JavaBean.  So we can call `assertThat(employee).hasEmployerAsString().doesNotContain("Initrode")`. 

Thanks to a patch to AssertJ by jstrachan of fabric8.io, I was also able to tweak the templates to provide navigation like the following:

`assertThat(underTest).employer().address().postalCode().startsWith("11");`



# Examples of the tests you can write
https://github.com/aro-tech/template-example/blob/master/src/test/java/org/example/test/EmployeeTest.java
##Blog
[![The Green Bar](https://img.shields.io/badge/My_Blog:-The_Green_Bar-brightgreen.svg)](https://thegreenbar.wordpress.com/)
