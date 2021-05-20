package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ThueTest {

    private static final String TEN_THUE = "TEN_THUE";
    @InjectMocks
    private Thue underTest;

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Thue.class);
        Thue thue1 = new Thue();
        thue1.setId(1L);
        Thue thue2 = new Thue();
        thue2.setId(thue1.getId());
        assertThat(thue1).isEqualTo(thue2);
        thue2.setId(2L);
        assertThat(thue1).isNotEqualTo(thue2);
        thue1.setId(null);
        assertThat(thue1).isNotEqualTo(thue2);
    }

    @Test
    void getId() {
    }

    @Test
    void id() {
    }

    @Test
    void getTenThue() {
    }

    @Test
    void tenThue() {
    }

    @Test
    void getGiaTriThue() {
    }

    @Test
    void giaTriThue() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Nested
    class WhenGettingId {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenIding {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingTenThue {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTeningThue {
        private final String TEN_THUE = "TEN_THUE";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingGiaTriThue {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGiaingTriThue {
        @BeforeEach
        void setup() {
        }
    }
}
