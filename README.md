# Examples of custom AssertJ mixins including generated assertions

Requires Java 8


##What you can learn here

With the maven command `mvn assertj:generate-assertions` you can generate custom assertions for the example JavaBeans. That's how classes here like EmployeeAssert were generated automatically.

In the src/test/resources directory there are custom templates for the generation of these assertions which allow extra fluidity. 

Note that the generated standard endpoint `Assertions.java` is not a class but a mixin interface.  The advantage of this is that no static imports are necessary, and you can build up test fixture capabilities by subtyping/subclassing. The generated standard endpoint `Assertions.java` is an example of a test fixture built up by subtyping/subclassing using mixins - it extends AllAssertions from my [tdd-mixins-junit4 project] (https://github.com/aro-tech/tdd-mixins-junit4).

Unfortunately, for now ([known issue] (https://github.com/joel-costigliola/assertj-assertions-generator/issues/65)), the AssertJ assertions generator does not allow renaming of the standard endpoint class, which is why EmployeeTest is defined using `implements org.example.assertions.generated.Assertions` instead of something like `implements CustomAssertionsMixin`. There are other classes named "Assertions", so I felt the need to use the fully qualified name for clarity.

##Blog
[![The Green Bar](https://img.shields.io/badge/My_Blog:-The_Green_Bar-brightgreen.svg)](https://thegreenbar.wordpress.com/)
