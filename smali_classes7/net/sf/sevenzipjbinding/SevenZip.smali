.class public Lnet/sf/sevenzipjbinding/SevenZip;
.super Ljava/lang/Object;
.source "SevenZip.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sf/sevenzipjbinding/SevenZip$ArchiveOpenCryptoCallback;,
        Lnet/sf/sevenzipjbinding/SevenZip$DummyOpenArchiveCallback;,
        Lnet/sf/sevenzipjbinding/SevenZip$Version;
    }
.end annotation


# static fields
.field private static final PROPERTY_BUILD_REF:Ljava/lang/String; = "build.ref"

.field private static final PROPERTY_SEVENZIPJBINDING_LIB_HASH:Ljava/lang/String; = "lib.%s.hash"

.field private static final PROPERTY_SEVENZIPJBINDING_LIB_NAME:Ljava/lang/String; = "lib.%s.name"

.field private static final SEVENZIPJBINDING_LIB_PROPERTIES:Ljava/lang/String; = "build.ref=000000000000\n\nlib.1.name=lib7-Zip-JBinding.so\nlib.1.hash=0000000000000000000000000000000000000000\n"

.field private static final SEVENZIPJBINDING_LIB_PROPERTIES_FILENAME:Ljava/lang/String; = "sevenzipjbinding-lib.properties"

.field public static final SEVENZIPJBINDING_MANIFEST_MF:Ljava/lang/String; = "Manifest-Version: 1.0\nImplementation-Vendor: sevenzipjbind.sf.net\nImplementation-Title: 7-Zip-JBinding native lib (Linux-arm)\nImplementation-Version: 16.02-2.02\nBuilt-By: Boris Brodski\nCMake: 3.3.2\nCreated-By: 1.6.0_33-b03 (Sun Microsystems Inc.)\nBuilt-Date: 2020-01-20 21:44:51Z\n"

.field private static final SEVENZIPJBINDING_PLATFORMS_PROPRETIES_FILENAME:Ljava/lang/String; = "/sevenzipjbinding-platforms.properties"

.field private static final SEVENZIPJBINDING_PLATFORM_PROPERTIES:Ljava/lang/String; = "platform.1=Linux-arm"

.field private static final SEVENZIPJBINDING_VERSION:Ljava/lang/String; = "16.02-2.02"

.field private static final SYSTEM_PROPERTY_SEVEN_ZIP_NO_DO_PRIVILEGED_INITIALIZATION:Ljava/lang/String; = "sevenzip.no_doprivileged_initialization"

.field private static final SYSTEM_PROPERTY_TMP:Ljava/lang/String; = "java.io.tmpdir"

.field private static autoInitializationWillOccur:Z = true

.field private static availablePlatforms:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static initializationSuccessful:Z

.field private static lastInitializationException:Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

.field private static temporaryArtifacts:[Ljava/io/File;

.field private static usedPlatform:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeInitSevenZipLibrary()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static applyTemporaryArtifacts(Ljava/io/File;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Ljava/io/File;

    sput-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->temporaryArtifacts:[Ljava/io/File;

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 3
    sget-object p1, Lnet/sf/sevenzipjbinding/SevenZip;->temporaryArtifacts:[Ljava/io/File;

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aput-object p0, p1, v0

    return-void
.end method

.method private static byteArrayToHex([B)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 2
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    .line 3
    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static callNativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    const-string v0, "SevenZip.callNativeOpenArchive(...): inStream parameter is null"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    invoke-static {p0, p1, p2}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0
.end method

.method private static copyLibraryToFS(Ljava/io/File;Ljava/io/InputStream;)V
    .locals 6

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/high16 v0, 0x10000

    :try_start_1
    new-array v0, v0, [B

    .line 2
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_0

    const/4 v3, 0x0

    .line 3
    invoke-virtual {v1, v0, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 4
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 5
    :catch_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    return-void

    :catch_2
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_3
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    .line 6
    :goto_1
    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error initializing SevenZipJBinding native library: can\'t copy native library out of a resource file to the temporary location: \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p0

    move-object v0, v1

    .line 8
    :goto_2
    :try_start_5
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_3

    :catch_4
    nop

    :goto_3
    if-eqz v0, :cond_1

    .line 9
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 10
    :catch_5
    :cond_1
    goto :goto_5

    :goto_4
    throw p0

    :goto_5
    goto :goto_4
.end method

.method private static copyOrSkipLibraries(Ljava/util/Properties;Ljava/io/File;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Properties;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    :goto_0
    new-array v3, v1, [Ljava/lang/Object;

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "lib.%s.name"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const-string v5, "lib.%s.hash"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p0, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {p0, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\'"

    if-nez v5, :cond_1

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    if-nez v8, :cond_0

    .line 7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "property file \'sevenzipjbinding-lib.properties\' from \'sevenzipjbinding-<Platform>.jar\' missing property \'"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->applyTemporaryArtifacts(Ljava/io/File;Ljava/util/List;)V

    return-object v0

    :cond_1
    :goto_1
    if-nez v6, :cond_2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "property file \'sevenzipjbinding-lib.properties\' from \'sevenzipjbinding-<Platform>.jar\' missing property "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " containing the hash for the library \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    :cond_2
    const-string v3, "java.vendor"

    const-string v4, "unknown"

    .line 10
    invoke-static {v3, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "The Android Project"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 11
    new-instance v3, Ljava/io/File;

    const-string v4, "lib|.so"

    const-string v6, ""

    invoke-virtual {v5, v4, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 12
    :cond_3
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-char v7, Ljava/io/File;->separatorChar:C

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v3, v6}, Lnet/sf/sevenzipjbinding/SevenZip;->hashMatched(Ljava/io/File;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 14
    :cond_4
    const-class v4, Lnet/sf/sevenzipjbinding/SevenZip;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v8, Lnet/sf/sevenzipjbinding/SevenZip;->usedPlatform:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4

    if-nez v4, :cond_5

    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "error loading native library \'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\' from a jar-file \'sevenzipjbinding-<Platform>.jar\'."

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    .line 16
    :cond_5
    invoke-static {v3, v4}, Lnet/sf/sevenzipjbinding/SevenZip;->copyLibraryToFS(Ljava/io/File;Ljava/io/InputStream;)V

    .line 17
    :cond_6
    :goto_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0
.end method

.method private static createOrVerifyTmpDir(Ljava/io/File;)Ljava/io/File;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const-string v0, "java.vendor"

    const-string v1, "unknown"

    .line 1
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "The Android Project"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    move-object v1, p0

    goto :goto_0

    :cond_1
    const-string v0, "java.io.tmpdir"

    .line 2
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v1, "can\'t determinte tmp directory. Use may use -Djava.io.tmpdir=<path to tmp dir> parameter for jvm to fix this."

    .line 3
    invoke-static {v1}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    .line 4
    :cond_2
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    const-string v2, "\'"

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_4

    .line 6
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid tmp directory \'"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    .line 7
    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    move-result p0

    if-nez p0, :cond_5

    .line 8
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "can\'t create files in \'"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    :cond_5
    return-object v1
.end method

.method private static determineAndSetUsedPlatform(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    if-nez p0, :cond_0

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->getPlatformBestMatch()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lnet/sf/sevenzipjbinding/SevenZip;->usedPlatform:Ljava/lang/String;

    goto :goto_0

    .line 2
    :cond_0
    sput-object p0, Lnet/sf/sevenzipjbinding/SevenZip;->usedPlatform:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method private static ensureLibraryIsInitialized()V
    .locals 3

    .line 1
    sget-boolean v0, Lnet/sf/sevenzipjbinding/SevenZip;->autoInitializationWillOccur:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lnet/sf/sevenzipjbinding/SevenZip;->autoInitializationWillOccur:Z

    .line 3
    :try_start_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->initSevenZipFromPlatformJAR()V
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    sput-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->lastInitializationException:Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    .line 5
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "SevenZipJBinding couldn\'t be initialized automaticly using initialization from platform depended JAR and the default temporary directory. Please, make sure the correct \'sevenzipjbinding-<Platform>.jar\' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: \'net.sf.sevenzipjbinding.SevenZip.init*()\'"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 6
    :cond_0
    :goto_0
    sget-boolean v0, Lnet/sf/sevenzipjbinding/SevenZip;->initializationSuccessful:Z

    if-eqz v0, :cond_1

    return-void

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->lastInitializationException:Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    const-string v2, "SevenZipJBinding wasn\'t initialized successfully last time."

    invoke-direct {v0, v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static declared-synchronized getLastInitializationException()Ljava/lang/Throwable;
    .locals 2

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->lastInitializationException:Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static getOrCreateSevenZipJBindingTmpDir(Ljava/io/File;Ljava/util/Properties;)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnet/sf/sevenzipjbinding/SevenZip;->getOrGenerateBuildRef(Ljava/util/Properties;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "java.vendor"

    const-string v1, "unknown"

    .line 2
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "The Android Project"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "SevenZipJBinding-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Directory \'"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' couldn\'t be created"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method private static getOrGenerateBuildRef(Ljava/util/Properties;)Ljava/lang/String;
    .locals 1

    const-string v0, "build.ref"

    .line 1
    invoke-virtual {p0, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    .line 2
    new-instance p0, Ljava/util/Random;

    invoke-direct {p0}, Ljava/util/Random;-><init>()V

    const v0, 0x989680

    invoke-virtual {p0, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static getPlatformBestMatch()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->getPlatformList()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    .line 3
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v1, "os.arch"

    .line 4
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "os.name"

    .line 5
    invoke-static {v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v2, v3, v2

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 8
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t find suited platform for os.arch="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", os.name="

    .line 10
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "... Available list of platforms: "

    .line 12
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 14
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 15
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 17
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static declared-synchronized getPlatformList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->availablePlatforms:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 2
    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    const-string v1, "java.vendor"

    const-string v2, "unknown"

    .line 3
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "The Android Project"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    new-instance v1, Ljava/io/ByteArrayInputStream;

    const-string v2, "platform.1=Linux-arm"

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    goto :goto_0

    :cond_1
    const-string v1, "/sevenzipjbinding-platforms.properties"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    .line 6
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    :try_start_2
    invoke-virtual {v2, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_3
    const-string v3, "Error loading existing property file /sevenzipjbinding-platforms.properties"

    .line 8
    invoke-static {v1, v3}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 9
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x1

    .line 10
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "platform."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    .line 11
    sput-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->availablePlatforms:Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object v1

    .line 12
    :cond_2
    :try_start_4
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 13
    :cond_3
    new-instance v1, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    const-string v2, "Can not find 7-Zip-JBinding platform property file /sevenzipjbinding-platforms.properties. Make sure the \'sevenzipjbinding-<Platform>.jar\' file is on the class path or consider initializing SevenZipJBinding manualy using one of the offered initialization methods: \'net.sf.sevenzipjbinding.SevenZip.init*()\'"

    invoke-direct {v1, v2}, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method

.method public static getSevenZipJBindingVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "16.02-2.02"

    return-object v0
.end method

.method public static getSevenZipVersion()Lnet/sf/sevenzipjbinding/SevenZip$Version;
    .locals 2

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ensureLibraryIsInitialized()V

    .line 2
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;

    invoke-direct {v0}, Lnet/sf/sevenzipjbinding/SevenZip$Version;-><init>()V

    .line 3
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeGetVersionMajor()I

    move-result v1

    iput v1, v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;->major:I

    .line 4
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeGetVersionMinor()I

    move-result v1

    iput v1, v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;->minor:I

    .line 5
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeGetVersionBuild()I

    move-result v1

    iput v1, v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;->build:I

    .line 6
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeGetVersionVersion()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;->version:Ljava/lang/String;

    .line 7
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeGetVersionDate()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;->date:Ljava/lang/String;

    .line 8
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeGetVersionCopyright()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lnet/sf/sevenzipjbinding/SevenZip$Version;->copyright:Ljava/lang/String;

    return-object v0
.end method

.method public static declared-synchronized getTemporaryArtifacts()[Ljava/io/File;
    .locals 2

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->temporaryArtifacts:[Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized getUsedPlatform()Ljava/lang/String;
    .locals 2

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->usedPlatform:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static hashMatched(Ljava/io/File;Ljava/lang/String;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const-string v0, "\'"

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "SHA1"

    .line 1
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_5

    .line 2
    :try_start_1
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4

    const/high16 v4, 0x20000

    :try_start_2
    new-array v4, v4, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 3
    :goto_0
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-gtz v5, :cond_0

    .line 4
    :try_start_4
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Lnet/sf/sevenzipjbinding/SevenZip;->byteArrayToHex([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 5
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error closing library file from the temp directory (opened for reading): \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 8
    invoke-static {v1, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_1
    return p1

    .line 9
    :cond_0
    :try_start_6
    invoke-virtual {v2, v4, v1, v5}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error reading from library file opened from the temp directory: \'"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 12
    invoke-static {p1, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 13
    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    :catch_2
    return v1

    :catchall_0
    move-exception p0

    :try_start_8
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 14
    :catch_3
    throw p0

    :catch_4
    move-exception p1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error opening library file from the temp directory for reading: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 17
    invoke-static {p1, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V

    return v1

    :catch_5
    move-exception p0

    const-string p1, "Error initializing SHA1 algorithm"

    .line 18
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V

    return v1
.end method

.method public static declared-synchronized initLoadedLibraries()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->initializationSuccessful:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 2
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 3
    :try_start_1
    sput-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->autoInitializationWillOccur:Z

    .line 4
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeInitialization()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static initSevenZipFromPlatformJAR()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {v0, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->initSevenZipFromPlatformJARIntern(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method public static initSevenZipFromPlatformJAR(Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->initSevenZipFromPlatformJARIntern(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method public static initSevenZipFromPlatformJAR(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    invoke-static {p0, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->initSevenZipFromPlatformJARIntern(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method public static initSevenZipFromPlatformJAR(Ljava/lang/String;Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 3
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->initSevenZipFromPlatformJARIntern(Ljava/lang/String;Ljava/io/File;)V

    return-void
.end method

.method private static declared-synchronized initSevenZipFromPlatformJARIntern(Ljava/lang/String;Ljava/io/File;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    sput-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->autoInitializationWillOccur:Z

    .line 2
    sget-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->initializationSuccessful:Z
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    :try_start_1
    invoke-static {p0}, Lnet/sf/sevenzipjbinding/SevenZip;->determineAndSetUsedPlatform(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->loadSevenZipJBindingLibProperties()Ljava/util/Properties;

    move-result-object p0

    .line 6
    invoke-static {p1}, Lnet/sf/sevenzipjbinding/SevenZip;->createOrVerifyTmpDir(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    .line 7
    invoke-static {p1, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->getOrCreateSevenZipJBindingTmpDir(Ljava/io/File;Ljava/util/Properties;)Ljava/io/File;

    move-result-object p1

    .line 8
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->copyOrSkipLibraries(Ljava/util/Properties;Ljava/io/File;)Ljava/util/List;

    move-result-object p0

    .line 9
    invoke-static {p0}, Lnet/sf/sevenzipjbinding/SevenZip;->loadNativeLibraries(Ljava/util/List;)V

    .line 10
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeInitialization()V
    :try_end_1
    .catch Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 12
    :try_start_2
    sput-object p0, Lnet/sf/sevenzipjbinding/SevenZip;->lastInitializationException:Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    .line 13
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized isAutoInitializationWillOccur()Z
    .locals 2

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->autoInitializationWillOccur:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized isInitializedSuccessfully()Z
    .locals 2

    const-class v0, Lnet/sf/sevenzipjbinding/SevenZip;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->initializationSuccessful:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static loadNativeLibraries(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "java.vendor"

    const-string v3, "unknown"

    .line 2
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "The Android Project"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_1

    .line 5
    :cond_0
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {v1}, Ljava/lang/System;->load(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "7-Zip-JBinding initialization failed: Error loading native library: \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    return-void
.end method

.method private static loadSevenZipJBindingLibProperties()Ljava/util/Properties;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lnet/sf/sevenzipjbinding/SevenZip;->usedPlatform:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java.vendor"

    const-string v2, "unknown"

    .line 2
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "The Android Project"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "sevenzipjbinding-lib.properties"

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Ljava/io/ByteArrayInputStream;

    const-string v3, "build.ref=000000000000\n\nlib.1.name=lib7-Zip-JBinding.so\nlib.1.hash=0000000000000000000000000000000000000000\n"

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    goto :goto_0

    .line 4
    :cond_0
    const-class v1, Lnet/sf/sevenzipjbinding/SevenZip;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_1

    .line 6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "error loading property file \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' from a jar-file \'sevenzipjbinding-<Platform>.jar\'. Is the platform jar-file not on the class path?"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    .line 7
    :cond_1
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 8
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v1, "error loading property file \'sevenzipjbinding-lib.properties\' from a jar-file \'sevenzipjbinding-<Platform>.jar\'"

    .line 9
    invoke-static {v1}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/String;)V

    :goto_1
    return-object v0
.end method

.method private static native nativeCreateArchive(Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;Lnet/sf/sevenzipjbinding/ArchiveFormat;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl<",
            "*>;",
            "Lnet/sf/sevenzipjbinding/ArchiveFormat;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation
.end method

.method private static native nativeGetVersionBuild()I
.end method

.method private static native nativeGetVersionCopyright()Ljava/lang/String;
.end method

.method private static native nativeGetVersionDate()Ljava/lang/String;
.end method

.method private static native nativeGetVersionMajor()I
.end method

.method private static native nativeGetVersionMinor()I
.end method

.method private static native nativeGetVersionVersion()Ljava/lang/String;
.end method

.method private static native nativeInitSevenZipLibrary()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation
.end method

.method private static nativeInitialization()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const-string v0, "sevenzip.no_doprivileged_initialization"

    .line 1
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    new-array v3, v1, [Ljava/lang/Throwable;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v5, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeInitSevenZipLibrary()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v4

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZip$1;

    invoke-direct {v0, v2, v3}, Lnet/sf/sevenzipjbinding/SevenZip$1;-><init>([Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 5
    :goto_1
    aget-object v0, v2, v4

    if-nez v0, :cond_3

    aget-object v0, v3, v4

    if-eqz v0, :cond_2

    goto :goto_2

    .line 6
    :cond_2
    sput-boolean v1, Lnet/sf/sevenzipjbinding/SevenZip;->initializationSuccessful:Z

    return-void

    .line 7
    :cond_3
    :goto_2
    aget-object v0, v2, v4

    if-nez v0, :cond_4

    const-string v0, "No message"

    .line 8
    :cond_4
    new-instance v1, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error initializing 7-Zip-JBinding: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aget-object v2, v3, v4

    invoke-direct {v1, v0, v2}, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sput-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->lastInitializationException:Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    .line 9
    throw v1
.end method

.method private static native nativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation
.end method

.method public static openInArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 8
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ensureLibraryIsInitialized()V

    .line 9
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZip$DummyOpenArchiveCallback;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnet/sf/sevenzipjbinding/SevenZip$DummyOpenArchiveCallback;-><init>(Lnet/sf/sevenzipjbinding/SevenZip$1;)V

    invoke-static {p0, p1, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->callNativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0
.end method

.method public static openInArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Ljava/lang/String;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 5
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ensureLibraryIsInitialized()V

    if-nez p2, :cond_0

    .line 6
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->openInArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZip$ArchiveOpenCryptoCallback;

    invoke-direct {v0, p2}, Lnet/sf/sevenzipjbinding/SevenZip$ArchiveOpenCryptoCallback;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->callNativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0
.end method

.method public static openInArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ensureLibraryIsInitialized()V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 2
    new-instance p2, Lnet/sf/sevenzipjbinding/SevenZip$DummyOpenArchiveCallback;

    invoke-direct {p2, v0}, Lnet/sf/sevenzipjbinding/SevenZip$DummyOpenArchiveCallback;-><init>(Lnet/sf/sevenzipjbinding/SevenZip$1;)V

    :cond_0
    if-eqz p0, :cond_1

    .line 3
    invoke-static {p0, p1, p2}, Lnet/sf/sevenzipjbinding/SevenZip;->callNativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0

    .line 4
    :cond_1
    invoke-static {v0, p1, p2}, Lnet/sf/sevenzipjbinding/SevenZip;->callNativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0
.end method

.method public static openOutArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/IOutCreateArchive;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/sevenzipjbinding/ArchiveFormat;",
            ")",
            "Lnet/sf/sevenzipjbinding/IOutCreateArchive<",
            "Lnet/sf/sevenzipjbinding/IOutItemAllFormats;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lnet/sf/sevenzipjbinding/SevenZip;->openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;

    move-result-object p0

    return-object p0
.end method

.method public static openOutArchive7z()Lnet/sf/sevenzipjbinding/IOutCreateArchive7z;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;

    move-result-object v0

    check-cast v0, Lnet/sf/sevenzipjbinding/IOutCreateArchive7z;

    return-object v0
.end method

.method public static openOutArchiveBZip2()Lnet/sf/sevenzipjbinding/IOutCreateArchiveBZip2;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->BZIP2:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;

    move-result-object v0

    check-cast v0, Lnet/sf/sevenzipjbinding/IOutCreateArchiveBZip2;

    return-object v0
.end method

.method public static openOutArchiveGZip()Lnet/sf/sevenzipjbinding/IOutCreateArchiveGZip;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->GZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;

    move-result-object v0

    check-cast v0, Lnet/sf/sevenzipjbinding/IOutCreateArchiveGZip;

    return-object v0
.end method

.method private static openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/sevenzipjbinding/ArchiveFormat;",
            ")",
            "Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ensureLibraryIsInitialized()V

    .line 2
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->isOutArchiveSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->getOutArchiveImplementation()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-static {v0, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeCreateArchive(Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;Lnet/sf/sevenzipjbinding/ArchiveFormat;)V

    return-object v0

    .line 5
    :catch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal error: Can\'t create new instance of the class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->getOutArchiveImplementation()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " using default constructor."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Archive format \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' doesn\'t support archive creation."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static openOutArchiveTar()Lnet/sf/sevenzipjbinding/IOutCreateArchiveTar;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->TAR:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;

    move-result-object v0

    check-cast v0, Lnet/sf/sevenzipjbinding/IOutCreateArchiveTar;

    return-object v0
.end method

.method public static openOutArchiveZip()Lnet/sf/sevenzipjbinding/IOutCreateArchiveZip;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipException;
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    invoke-static {v0}, Lnet/sf/sevenzipjbinding/SevenZip;->openOutArchiveIntern(Lnet/sf/sevenzipjbinding/ArchiveFormat;)Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;

    move-result-object v0

    check-cast v0, Lnet/sf/sevenzipjbinding/IOutCreateArchiveZip;

    return-object v0
.end method

.method private static throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error loading SevenZipJBinding native library into JVM: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " [You may also try different SevenZipJBinding initialization methods \'net.sf.sevenzipjbinding.SevenZip.init*()\' in order to solve this problem] "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static throwInitException(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/sevenzipjbinding/SevenZipNativeInitializationException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {v0, p0}, Lnet/sf/sevenzipjbinding/SevenZip;->throwInitException(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method
