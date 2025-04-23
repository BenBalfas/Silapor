package com.example.silapor.model

object DummyFieldData {
    val cities = listOf(
        City(1, "Jakarta"),
        City(2, "Bandung"),
        City(3, "Bogor"),
        City(4, "Depok"),
        City(5, "Bekasi"),
    )

    val sports = listOf(
        Sport( "Futsal", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBmlia5oYYzYlbD9aP0UIzlFs08Do2zUcrMw&s"),
        Sport( "Badminton", "https://asset.ayo.co.id/image/venue/168398058571403.image_cropper_1683980470943_large.jpg")
    )

    val fields = listOf(
        // Jakarta
        Field(
            1,
            1,
            "Futsal",
            "Futsal Kemang",
            "Jl. Kemang Raya No.5, Jakarta",
            200000,
            "https://example.com/futsal-kemang.jpg"
        ),
        Field(
            2,
            1,
            "Futsal",
            "Futsal Tebet Arena",
            "Jl. Tebet Dalam No.1, Jakarta",
            180000,
            "https://example.com/futsal-tebet.jpg"
        ),
        Field(
            3,
            1,
            "Futsal",
            "Futsal Pondok Indah",
            "Jl. Metro Pondok Indah, Jakarta",
            250000,
            "https://example.com/futsal-pondokindah.jpg"
        ),
        Field(
            4,
            1,
            "Futsal",
            "Futsal Kuningan",
            "Jl. Kuningan Barat, Jakarta",
            220000,
            "https://example.com/futsal-kuningan.jpg"
        ),
        Field(
            5,
            1,
            "Futsal",
            "Futsal Kelapa Gading",
            "Jl. Kelapa Gading Timur, Jakarta",
            210000,
            "https://example.com/futsal-gading.jpg"
        ),
        Field(
            6,
            1,
            "Badminton",
            "GOR Senayan",
            "Jl. Asia Afrika, Jakarta",
            120000,
            "https://example.com/gor-senayan.jpg"
        ),
        Field(
            7,
            1,
            "Badminton",
            "GOR Cempaka Putih",
            "Jl. Cempaka Putih Raya, Jakarta",
            100000,
            "https://example.com/gor-cempaka.jpg"
        ),
        Field(
            8,
            1,
            "Badminton",
            "GOR Rawamangun",
            "Jl. Pemuda No.88, Jakarta",
            130000,
            "https://example.com/gor-rawamangun.jpg"
        ),
        Field(
            9,
            1,
            "Badminton",
            "GOR Pasar Minggu",
            "Jl. Ragunan, Jakarta",
            110000,
            "https://example.com/gor-ragunan.jpg"
        ),
        Field(
            10,
            1,
            "Badminton",
            "GOR Tanjung Priok",
            "Jl. Enggano No.5, Jakarta",
            125000,
            "https://example.com/gor-priok.jpg"
        ),

        // Bandung
        Field(
            11,
            2,
            "Futsal",
            "Futsal Galaxy Bandung",
            "Jl. Soekarno Hatta No.25, Bandung",
            150000,
            "https://example.com/galaxy-bandung.jpg"
        ),
        Field(
            12,
            2,
            "Futsal",
            "Futsal Dago Arena",
            "Jl. Dago Atas No.7, Bandung",
            160000,
            "https://example.com/futsal-dago.jpg"
        ),
        Field(
            13,
            2,
            "Futsal",
            "Futsal Ujungberung",
            "Jl. AH Nasution No.18, Bandung",
            140000,
            "https://example.com/futsal-ujung.jpg"
        ),
        Field(
            14,
            2,
            "Futsal",
            "Futsal Cibiru",
            "Jl. Cibiru No.99, Bandung",
            130000,
            "https://example.com/futsal-cibiru.jpg"
        ),
        Field(
            15,
            2,
            "Futsal",
            "Futsal Setiabudi",
            "Jl. Setiabudi No.23, Bandung",
            170000,
            "https://example.com/futsal-setiabudi.jpg"
        ),
        Field(
            16,
            2,
            "Badminton",
            "GOR Siliwangi",
            "Jl. Aceh No.66, Bandung",
            100000,
            "https://example.com/gor-siliwangi.jpg"
        ),
        Field(
            17,
            2,
            "Badminton",
            "GOR Pajajaran",
            "Jl. Pajajaran No.37, Bandung",
            95000,
            "https://example.com/gor-pajajaran.jpg"
        ),
        Field(
            18,
            2,
            "Badminton",
            "GOR Lodaya",
            "Jl. Lodaya No.38, Bandung",
            110000,
            "https://example.com/gor-lodaya.jpg"
        ),
        Field(
            19,
            2,
            "Badminton",
            "GOR Ujungberung",
            "Jl. AH Nasution No.15, Bandung",
            105000,
            "https://example.com/gor-ujung.jpg"
        ),
        Field(
            20,
            2,
            "Badminton",
            "GOR Cimahi",
            "Jl. Kolonel Masturi No.1, Cimahi",
            95000,
            "https://example.com/gor-cimahi.jpg"
        ),

        // Bogor
        Field(
            21,
            3,
            "Futsal",
            "Futsal Padjajaran",
            "Jl. Padjajaran No.10, Bogor",
            150000,
            "https://example.com/futsal-padjajaran.jpg"
        ),
        Field(
            22,
            3,
            "Futsal",
            "Futsal Bogor Nirwana",
            "Jl. Dreded, Bogor",
            160000,
            "https://example.com/futsal-nirwana.jpg"
        ),
        Field(
            23,
            3,
            "Futsal",
            "Futsal Cimanggu",
            "Jl. Cimanggu No.12, Bogor",
            140000,
            "https://example.com/futsal-cimanggu.jpg"
        ),
        Field(
            24,
            3,
            "Futsal",
            "Futsal Dramaga",
            "Jl. Raya Dramaga, Bogor",
            130000,
            "https://example.com/futsal-dramaga.jpg"
        ),
        Field(
            25,
            3,
            "Futsal",
            "Futsal Sentul",
            "Jl. Sentul Raya, Bogor",
            170000,
            "https://example.com/futsal-sentul.jpg"
        ),
        Field(
            26,
            3,
            "Badminton",
            "GOR Yasmin",
            "Jl. KH. Abdullah Bin Nuh, Bogor",
            95000,
            "https://example.com/gor-yasmin.jpg"
        ),
        Field(
            27,
            3,
            "Badminton",
            "GOR Semplak",
            "Jl. Semplak, Bogor",
            90000,
            "https://example.com/gor-semplak.jpg"
        ),
        Field(
            28,
            3,
            "Badminton",
            "GOR Taman Yasmin",
            "Jl. Sholeh Iskandar, Bogor",
            110000,
            "https://example.com/gor-tamanyasmin.jpg"
        ),
        Field(
            29,
            3,
            "Badminton",
            "GOR Cibinong",
            "Jl. Raya Cibinong, Bogor",
            100000,
            "https://example.com/gor-cibinong.jpg"
        ),
        Field(
            30,
            3,
            "Badminton",
            "GOR Tanah Baru",
            "Jl. Tanah Baru, Bogor",
            95000,
            "https://example.com/gor-tanahbaru.jpg"
        ),

        // Depok
        // Depok (ID: 4)
        Field(
            31,
            4,
            "Futsal",
            "Futsal Margonda",
            "Jl. Margonda Raya No.12, Depok",
            150000,
            "https://example.com/futsal-margonda.jpg"
        ),
        Field(
            32,
            4,
            "Futsal",
            "Futsal Depok Town Square",
            "Jl. Raya Kalimulya, Depok",
            160000,
            "https://example.com/futsal-deto.jpg"
        ),
        Field(
            33,
            4,
            "Futsal",
            "Futsal Cinere",
            "Jl. Raya Cinere No.8, Depok",
            140000,
            "https://example.com/futsal-cinere.jpg"
        ),
        Field(
            34,
            4,
            "Futsal",
            "Futsal Sawangan",
            "Jl. Raya Sawangan No.45, Depok",
            130000,
            "https://example.com/futsal-sawangan.jpg"
        ),
        Field(
            35,
            4,
            "Futsal",
            "Futsal UI Depok",
            "Jl. Lingkar UI, Depok",
            120000,
            "https://example.com/futsal-ui.jpg"
        ),
        Field(
            36,
            4,
            "Badminton",
            "GOR Pancoran Mas",
            "Jl. Pemuda No.1, Depok",
            90000,
            "https://example.com/gor-pancoran.jpg"
        ),
        Field(
            37,
            4,
            "Badminton",
            "GOR Beji",
            "Jl. Beji Timur No.5, Depok",
            85000,
            "https://example.com/gor-beji.jpg"
        ),
        Field(
            38,
            4,
            "Badminton",
            "GOR Cimanggis",
            "Jl. Raya Cimanggis, Depok",
            95000,
            "https://example.com/gor-cimanggis.jpg"
        ),
        Field(
            39,
            4,
            "Badminton",
            "GOR Limo",
            "Jl. Limo Raya, Depok",
            80000,
            "https://example.com/gor-limo.jpg"
        ),
        Field(
            40,
            4,
            "Badminton",
            "GOR Depok Jaya",
            "Jl. Nusantara Raya, Depok",
            100000,
            "https://example.com/gor-depokjaya.jpg"
        ),

        // Bekasi (ID: 5)
        Field(
            41,
            5,
            "Futsal",
            "Futsal Grand Galaxy",
            "Jl. Boulevard Grand Galaxy, Bekasi",
            180000,
            "https://example.com/futsal-galaxy.jpg"
        ),
        Field(
            42,
            5,
            "Futsal",
            "Futsal Bekasi Timur",
            "Jl. Raya Bekasi Timur No.33, Bekasi",
            160000,
            "https://example.com/futsal-bekasitimur.jpg"
        ),
        Field(
            43,
            5,
            "Futsal",
            "Futsal Harapan Indah",
            "Jl. Harapan Indah Boulevard, Bekasi",
            170000,
            "https://example.com/futsal-harapanindah.jpg"
        ),
        Field(
            44,
            5,
            "Futsal",
            "Futsal Pondok Gede",
            "Jl. Raya Pondok Gede, Bekasi",
            150000,
            "https://example.com/futsal-pondokgede.jpg"
        ),
        Field(
            45,
            5,
            "Futsal",
            "Futsal Cikarang",
            "Jl. Industri Cikarang Selatan, Bekasi",
            140000,
            "https://example.com/futsal-cikarang.jpg"
        ),
        Field(
            46,
            5,
            "Badminton",
            "GOR Patriot Chandrabaga",
            "Jl. Chandrabaga No.5, Bekasi",
            110000,
            "https://example.com/gor-patriot.jpg"
        ),
        Field(
            47,
            5,
            "Badminton",
            "GOR Bekasi Barat",
            "Jl. Raya Bekasi Barat No.12, Bekasi",
            95000,
            "https://example.com/gor-bekasibarat.jpg"
        ),
        Field(
            48,
            5,
            "Badminton",
            "GOR Summarecon Bekasi",
            "Jl. Boulevard Ahmad Yani, Bekasi",
            120000,
            "https://example.com/gor-summarecon.jpg"
        ),
        Field(
            49,
            5,
            "Badminton",
            "GOR Bantar Gebang",
            "Jl. Raya Narogong, Bekasi",
            85000,
            "https://example.com/gor-bantargebang.jpg"
        ),
        Field(
            50,
            5,
            "Badminton",
            "GOR Mustika Jaya",
            "Jl. Mustika Jaya No.8, Bekasi",
            100000,
            "https://example.com/gor-mustika.jpg"
        )
    )
}