package demo 

import org.junit.Assert.assertEquals
import org.junit.Test
import com.molikuner.getGreeting

class TestSource {
    @Test fun f() {
        assertEquals("kotlin-project-https://github.com/molikuner/kotlin-project", getGreeting())
    }
}
