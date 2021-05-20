package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HoGiaDinhTest {

    private static final String TEN_CHU_HO = "TEN_CHU_HO";
    private static final String MA_HO = "MA_HO";
    private static final String SO_CAN_CUOC = "SO_CAN_CUOC";
    private static final String LOAI_HO = "LOAI_HO";
    private static final String SO_HO_NGHEO = "SO_HO_NGHEO";
    private static final String EMAIL = "EMAIL";
    private static final String SDT = "SDT";
    private static final String DIA_CHI = "DIA_CHI";
    @Mock
    private TaiKhoan taikhoan;
    @Mock
    private HoaDon hoadongd;
    @InjectMocks
    private HoGiaDinh underTest;

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(HoGiaDinh.class);
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh();
        hoGiaDinh1.setId(1L);
        HoGiaDinh hoGiaDinh2 = new HoGiaDinh();
        hoGiaDinh2.setId(hoGiaDinh1.getId());
        assertThat(hoGiaDinh1).isEqualTo(hoGiaDinh2);
        hoGiaDinh2.setId(2L);
        assertThat(hoGiaDinh1).isNotEqualTo(hoGiaDinh2);
        hoGiaDinh1.setId(null);
        assertThat(hoGiaDinh1).isNotEqualTo(hoGiaDinh2);
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void id() {
    }

    @Test
    void getTenChuHo() {
    }

    @Test
    void tenChuHo() {
    }

    @Test
    void setTenChuHo() {
    }

    @Test
    void getMaHo() {
    }

    @Test
    void maHo() {
    }

    @Test
    void setMaHo() {
    }

    @Test
    void getSoCanCuoc() {
    }

    @Test
    void soCanCuoc() {
    }

    @Test
    void setSoCanCuoc() {
    }

    @Test
    void getLoaiHo() {
    }

    @Test
    void loaiHo() {
    }

    @Test
    void setLoaiHo() {
    }

    @Test
    void getSoHoNgheo() {
    }

    @Test
    void soHoNgheo() {
    }

    @Test
    void setSoHoNgheo() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void email() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getSdt() {
    }

    @Test
    void sdt() {
    }

    @Test
    void setSdt() {
    }

    @Test
    void getDiaChi() {
    }

    @Test
    void diaChi() {
    }

    @Test
    void getTaikhoan() {
    }

    @Test
    void setTaikhoan() {
    }

    @Test
    void getHoadongd() {
    }

    @Test
    void hoadongd() {
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
    class WhenGettingTenChuHo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTeningChuHo {
        private final String TEN_CHU_HO = "TEN_CHU_HO";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingMaHo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenMaingHo {
        private final String MA_HO = "MA_HO";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingSoCanCuoc {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenSoingCanCuoc {
        private final String SO_CAN_CUOC = "SO_CAN_CUOC";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingLoaiHo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenLoaiingHo {
        private final String LOAI_HO = "LOAI_HO";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingSoHoNgheo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenSoingHoNgheo {
        private final String SO_HO_NGHEO = "SO_HO_NGHEO";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingEmail {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenEmailing {
        private final String EMAIL = "EMAIL";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingSdt {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenSdting {
        private final String SDT = "SDT";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingDiaChi {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenDiaingChi {
        private final String DIA_CHI = "DIA_CHI";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingTaikhoan {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTaikhoaning {
        @Mock
        private TaiKhoan taiKhoan;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingHoadongd {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenHoadongding {
        @Mock
        private HoaDon hoaDon;

        @BeforeEach
        void setup() {
        }
    }
}
