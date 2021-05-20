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

import java.time.Instant;

@ExtendWith(MockitoExtension.class)
class HoaDonTest {

    private static final String TEN_CHU_HO = "TEN_CHU_HO";
    private static final Instant NGAY_THANH_TOAN = Instant.now();
    private static final String TRANG_THAI_THANH_TOAN = "TRANG_THAI_THANH_TOAN";
    @Mock
    private Thue thue;
    @Mock
    private BacTienHoNgheo bacHoNgheo;
    @Mock
    private BacTienHoThuong bacHoThuong;
    @Mock
    private HoGiaDinh giadinh;
    @InjectMocks
    private HoaDon underTest;

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(HoaDon.class);
        HoaDon hoaDon1 = new HoaDon();
        hoaDon1.setId(1L);
        HoaDon hoaDon2 = new HoaDon();
        hoaDon2.setId(hoaDon1.getId());
        assertThat(hoaDon1).isEqualTo(hoaDon2);
        hoaDon2.setId(2L);
        assertThat(hoaDon1).isNotEqualTo(hoaDon2);
        hoaDon1.setId(null);
        assertThat(hoaDon1).isNotEqualTo(hoaDon2);
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
    void getThangSuDung() {
    }

    @Test
    void thangSuDung() {
    }

    @Test
    void setThangSuDung() {
    }

    @Test
    void getChiSoMoi() {
    }

    @Test
    void chiSoMoi() {
    }

    @Test
    void setChiSoMoi() {
    }

    @Test
    void getChiSoCu() {
    }

    @Test
    void chiSoCu() {
    }

    @Test
    void setChiSoCu() {
    }

    @Test
    void getSoNuoc() {
    }

    @Test
    void soNuoc() {
    }

    @Test
    void setSoNuoc() {
    }

    @Test
    void getThanhTien() {
    }

    @Test
    void thanhTien() {
    }

    @Test
    void setThanhTien() {
    }

    @Test
    void getTienThue() {
    }

    @Test
    void tienThue() {
    }

    @Test
    void setTienThue() {
    }

    @Test
    void getTongTien() {
    }

    @Test
    void tongTien() {
    }

    @Test
    void setTongTien() {
    }

    @Test
    void getNgayThanhToan() {
    }

    @Test
    void ngayThanhToan() {
    }

    @Test
    void setNgayThanhToan() {
    }

    @Test
    void getTrangThaiThanhToan() {
    }

    @Test
    void trangThaiThanhToan() {
    }

    @Test
    void setTrangThaiThanhToan() {
    }

    @Test
    void getThue() {
    }

    @Test
    void thue() {
    }

    @Test
    void setThue() {
    }

    @Test
    void getBacHoNgheo() {
    }

    @Test
    void bacHoNgheo() {
    }

    @Test
    void setBacHoNgheo() {
    }

    @Test
    void getBacHoThuong() {
    }

    @Test
    void bacHoThuong() {
    }

    @Test
    void setBacHoThuong() {
    }

    @Test
    void getGiadinh() {
    }

    @Test
    void giadinh() {
    }

    @Test
    void setGiadinh() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testGetId() {
    }

    @Test
    void testSetId() {
    }

    @Test
    void testId() {
    }

    @Test
    void testGetTenChuHo() {
    }

    @Test
    void testTenChuHo() {
    }

    @Test
    void testSetTenChuHo() {
    }

    @Test
    void testGetThangSuDung() {
    }

    @Test
    void testThangSuDung() {
    }

    @Test
    void testSetThangSuDung() {
    }

    @Test
    void testGetChiSoMoi() {
    }

    @Test
    void testChiSoMoi() {
    }

    @Test
    void testSetChiSoMoi() {
    }

    @Test
    void testGetChiSoCu() {
    }

    @Test
    void testChiSoCu() {
    }

    @Test
    void testSetChiSoCu() {
    }

    @Test
    void testGetSoNuoc() {
    }

    @Test
    void testSoNuoc() {
    }

    @Test
    void testSetSoNuoc() {
    }

    @Test
    void testGetThanhTien() {
    }

    @Test
    void testThanhTien() {
    }

    @Test
    void testSetThanhTien() {
    }

    @Test
    void testGetTienThue() {
    }

    @Test
    void testTienThue() {
    }

    @Test
    void testSetTienThue() {
    }

    @Test
    void testGetTongTien() {
    }

    @Test
    void testTongTien() {
    }

    @Test
    void testSetTongTien() {
    }

    @Test
    void testGetNgayThanhToan() {
    }

    @Test
    void testNgayThanhToan() {
    }

    @Test
    void testSetNgayThanhToan() {
    }

    @Test
    void testGetTrangThaiThanhToan() {
    }

    @Test
    void testTrangThaiThanhToan() {
    }

    @Test
    void testSetTrangThaiThanhToan() {
    }

    @Test
    void testGetThue() {
    }

    @Test
    void testThue() {
    }

    @Test
    void testSetThue() {
    }

    @Test
    void testGetBacHoNgheo() {
    }

    @Test
    void testBacHoNgheo() {
    }

    @Test
    void testSetBacHoNgheo() {
    }

    @Test
    void testGetBacHoThuong() {
    }

    @Test
    void testBacHoThuong() {
    }

    @Test
    void testSetBacHoThuong() {
    }

    @Test
    void testGetGiadinh() {
    }

    @Test
    void testGiadinh() {
    }

    @Test
    void testSetGiadinh() {
    }

    @Test
    void testEquals1() {
    }

    @Test
    void testHashCode1() {
    }

    @Test
    void testToString1() {
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
    class WhenGettingThangSuDung {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenThangingSuDung {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingChiSoMoi {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenChiingSoMoi {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingChiSoCu {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenChiingSoCu {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingSoNuoc {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenSoingNuoc {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingThanhTien {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenThanhingTien {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingTienThue {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTieningThue {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingTongTien {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTongingTien {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingNgayThanhToan {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenNgayingThanhToan {
        private final Instant NGAY_THANH_TOAN = Instant.now();

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingTrangThaiThanhToan {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenTrangingThaiThanhToan {
        private final String TRANG_THAI_THANH_TOAN = "TRANG_THAI_THANH_TOAN";

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingThue {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenThuing {
        @Mock
        private Thue thue;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingBacHoNgheo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenBacingHoNgheo {
        @Mock
        private BacTienHoNgheo bacTienHoNgheo;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingBacHoThuong {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenBacingHoThuong {
        @Mock
        private BacTienHoThuong bacTienHoThuong;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingGiadinh {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGiadinhing {
        @Mock
        private HoGiaDinh hoGiaDinh;

        @BeforeEach
        void setup() {
        }
    }
}
