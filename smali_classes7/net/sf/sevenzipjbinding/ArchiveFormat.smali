.class public final enum Lnet/sf/sevenzipjbinding/ArchiveFormat;
.super Ljava/lang/Enum;
.source "ArchiveFormat.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/sf/sevenzipjbinding/ArchiveFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum AR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ARJ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum BZIP2:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CAB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CHM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum CPIO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum FAT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum GZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum HFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ISO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LZH:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum LZMA:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum NSIS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum NTFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum RAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum RAR5:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum RPM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum SPLIT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum TAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum UDF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum WIM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum XAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum Z:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public static final enum ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;


# instance fields
.field private codecIndex:I

.field private methodName:Ljava/lang/String;

.field outArchiveImplementation:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl<",
            "*>;>;"
        }
    .end annotation
.end field

.field private supportMultipleFiles:Z


# direct methods
.method static constructor <clinit>()V
    .locals 40

    .line 1
    new-instance v6, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v4, Lnet/sf/sevenzipjbinding/impl/OutArchiveZipImpl;

    const-string v1, "ZIP"

    const/4 v2, 0x0

    const-string v3, "Zip"

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v6, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 2
    new-instance v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v11, Lnet/sf/sevenzipjbinding/impl/OutArchiveTarImpl;

    const-string v8, "TAR"

    const/4 v9, 0x1

    const-string v10, "Tar"

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->TAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 3
    new-instance v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v2, "SPLIT"

    const/4 v3, 0x2

    const-string v4, "Split"

    invoke-direct {v1, v2, v3, v4, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SPLIT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 4
    new-instance v2, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v4, "RAR"

    const/4 v7, 0x3

    const-string v8, "Rar"

    invoke-direct {v2, v4, v7, v8, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v2, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 5
    new-instance v4, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v8, "RAR5"

    const/4 v9, 0x4

    const-string v10, "Rar5"

    invoke-direct {v4, v8, v9, v10, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v4, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RAR5:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 6
    new-instance v8, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v10, "LZMA"

    const/4 v11, 0x5

    const-string v12, "Lzma"

    const/4 v13, 0x0

    invoke-direct {v8, v10, v11, v12, v13}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v8, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZMA:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 7
    new-instance v10, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v12, "ISO"

    const/4 v14, 0x6

    const-string v15, "Iso"

    invoke-direct {v10, v12, v14, v15, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v10, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ISO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 8
    new-instance v12, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v15, "HFS"

    const/4 v14, 0x7

    invoke-direct {v12, v15, v14, v15, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v12, Lnet/sf/sevenzipjbinding/ArchiveFormat;->HFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 9
    new-instance v15, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v20, Lnet/sf/sevenzipjbinding/impl/OutArchiveGZipImpl;

    const-string v17, "GZIP"

    const/16 v18, 0x8

    const-string v19, "GZip"

    const/16 v21, 0x0

    move-object/from16 v16, v15

    invoke-direct/range {v16 .. v21}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v15, Lnet/sf/sevenzipjbinding/ArchiveFormat;->GZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 10
    new-instance v14, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v11, "CPIO"

    const/16 v9, 0x9

    const-string v7, "Cpio"

    invoke-direct {v14, v11, v9, v7, v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v14, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CPIO:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 11
    new-instance v7, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v24, Lnet/sf/sevenzipjbinding/impl/OutArchiveBZip2Impl;

    const-string v21, "BZIP2"

    const/16 v22, 0xa

    const-string v23, "BZip2"

    const/16 v25, 0x0

    move-object/from16 v20, v7

    invoke-direct/range {v20 .. v25}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v7, Lnet/sf/sevenzipjbinding/ArchiveFormat;->BZIP2:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 12
    new-instance v11, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-class v30, Lnet/sf/sevenzipjbinding/impl/OutArchive7zImpl;

    const-string v27, "SEVEN_ZIP"

    const/16 v28, 0xb

    const-string v29, "7z"

    const/16 v31, 0x1

    move-object/from16 v26, v11

    invoke-direct/range {v26 .. v31}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    sput-object v11, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 13
    new-instance v9, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v3, "Z"

    const/16 v5, 0xc

    invoke-direct {v9, v3, v5, v3, v13}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v9, Lnet/sf/sevenzipjbinding/ArchiveFormat;->Z:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 14
    new-instance v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v5, "ARJ"

    const/16 v13, 0xd

    move-object/from16 v25, v9

    const-string v9, "Arj"

    const/4 v11, 0x1

    invoke-direct {v3, v5, v13, v9, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ARJ:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 15
    new-instance v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "CAB"

    const/16 v13, 0xe

    move-object/from16 v27, v3

    const-string v3, "Cab"

    invoke-direct {v5, v9, v13, v3, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CAB:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 16
    new-instance v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "LZH"

    const/16 v13, 0xf

    move-object/from16 v29, v5

    const-string v5, "Lzh"

    invoke-direct {v3, v9, v13, v5, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->LZH:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 17
    new-instance v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "CHM"

    const/16 v13, 0x10

    move-object/from16 v31, v3

    const-string v3, "Chm"

    invoke-direct {v5, v9, v13, v3, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;->CHM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 18
    new-instance v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "NSIS"

    const/16 v13, 0x11

    move-object/from16 v32, v5

    const-string v5, "Nsis"

    invoke-direct {v3, v9, v13, v5, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->NSIS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 19
    new-instance v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "AR"

    const/16 v13, 0x12

    move-object/from16 v33, v3

    const-string v3, "Ar"

    invoke-direct {v5, v9, v13, v3, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;->AR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 20
    new-instance v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "RPM"

    const/16 v13, 0x13

    move-object/from16 v34, v5

    const-string v5, "Rpm"

    invoke-direct {v3, v9, v13, v5, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->RPM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 21
    new-instance v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "UDF"

    const/16 v13, 0x14

    move-object/from16 v35, v3

    const-string v3, "Udf"

    invoke-direct {v5, v9, v13, v3, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;->UDF:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 22
    new-instance v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "WIM"

    const/16 v13, 0x15

    move-object/from16 v36, v5

    const-string v5, "Wim"

    invoke-direct {v3, v9, v13, v5, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->WIM:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 23
    new-instance v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "XAR"

    const/16 v13, 0x16

    move-object/from16 v37, v3

    const-string v3, "Xar"

    invoke-direct {v5, v9, v13, v3, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;->XAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 24
    new-instance v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "FAT"

    const/16 v13, 0x17

    move-object/from16 v38, v5

    const-string v5, "fat"

    invoke-direct {v3, v9, v13, v5, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->FAT:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 25
    new-instance v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const-string v9, "NTFS"

    const/16 v13, 0x18

    move-object/from16 v39, v3

    const-string v3, "ntfs"

    invoke-direct {v5, v9, v13, v3, v11}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v5, Lnet/sf/sevenzipjbinding/ArchiveFormat;->NTFS:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/16 v3, 0x19

    new-array v3, v3, [Lnet/sf/sevenzipjbinding/ArchiveFormat;

    const/4 v9, 0x0

    aput-object v6, v3, v9

    aput-object v0, v3, v11

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    const/4 v0, 0x4

    aput-object v4, v3, v0

    const/4 v0, 0x5

    aput-object v8, v3, v0

    const/4 v0, 0x6

    aput-object v10, v3, v0

    const/4 v0, 0x7

    aput-object v12, v3, v0

    const/16 v0, 0x8

    aput-object v15, v3, v0

    const/16 v0, 0x9

    aput-object v14, v3, v0

    const/16 v0, 0xa

    aput-object v7, v3, v0

    const/16 v0, 0xb

    aput-object v26, v3, v0

    const/16 v0, 0xc

    aput-object v25, v3, v0

    const/16 v0, 0xd

    aput-object v27, v3, v0

    const/16 v0, 0xe

    aput-object v29, v3, v0

    const/16 v0, 0xf

    aput-object v31, v3, v0

    const/16 v0, 0x10

    aput-object v32, v3, v0

    const/16 v0, 0x11

    aput-object v33, v3, v0

    const/16 v0, 0x12

    aput-object v34, v3, v0

    const/16 v0, 0x13

    aput-object v35, v3, v0

    const/16 v0, 0x14

    aput-object v36, v3, v0

    const/16 v0, 0x15

    aput-object v37, v3, v0

    const/16 v0, 0x16

    aput-object v38, v3, v0

    const/16 v0, 0x17

    aput-object v39, v3, v0

    const/16 v0, 0x18

    aput-object v5, v3, v0

    .line 26
    sput-object v3, Lnet/sf/sevenzipjbinding/ArchiveFormat;->$VALUES:[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl<",
            "*>;>;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, -0x2

    .line 3
    iput p1, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->codecIndex:I

    .line 4
    iput-object p3, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->methodName:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->outArchiveImplementation:Ljava/lang/Class;

    .line 6
    iput-boolean p5, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->supportMultipleFiles:Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lnet/sf/sevenzipjbinding/ArchiveFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;Z)V

    return-void
.end method

.method static findOutArchiveImplementationToInterface(Ljava/lang/Class;)Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lnet/sf/sevenzipjbinding/IOutCreateArchive<",
            "*>;>;)",
            "Lnet/sf/sevenzipjbinding/ArchiveFormat;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->values()[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->getOutArchiveImplementation()Ljava/lang/Class;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 3
    invoke-virtual {p0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_1
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t determine corresponding archive format to the interface "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lnet/sf/sevenzipjbinding/IOutArchive;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 1

    .line 1
    const-class v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-object p0
.end method

.method public static values()[Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 1

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->$VALUES:[Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-virtual {v0}, [Lnet/sf/sevenzipjbinding/ArchiveFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-object v0
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->methodName:Ljava/lang/String;

    return-object v0
.end method

.method public getOutArchiveImplementation()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->outArchiveImplementation:Ljava/lang/Class;

    return-object v0
.end method

.method public isOutArchiveSupported()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->outArchiveImplementation:Ljava/lang/Class;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public supportMultipleFiles()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->supportMultipleFiles:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->methodName:Ljava/lang/String;

    return-object v0
.end method
