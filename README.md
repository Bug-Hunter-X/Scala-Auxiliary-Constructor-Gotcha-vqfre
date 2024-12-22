# Scala Auxiliary Constructor Subtlety

This example highlights a potential issue when using auxiliary constructors in Scala. While the code functions correctly, the behavior might not be immediately obvious and could become a source of confusion in larger projects.

The `MyClass` uses an auxiliary constructor to provide a default value for `x`.  While this works fine here, it's crucial to understand that the primary constructor is still being called, and unexpected side effects could occur if the primary constructor performs non-trivial initialization.