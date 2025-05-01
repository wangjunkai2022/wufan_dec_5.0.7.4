.class public final enum Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_CONVERT:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_DRAW:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_FULLSCREEN:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_INTERSTITIAL:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_NATIVE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_REWARD:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_SDK_INIT:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_SPLASH:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum AD_WEBVIEW:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_FEED_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_HORIZONTAL_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_HOTSPOT_ENTRY:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_HOTSPOT_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_IMAGE_TEXT_DETAIL:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_IMAGE_TEXT_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_PROFILE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_PROFILE_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_VIDEO_DETAIL:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_WALLPAPER_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum CU_WALLPAPER_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum EU_LIVE_REPLAY:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum EU_LIVE_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum OTHER:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum TACHIKOMA:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

.field public static final enum WEB_CACHE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;


# instance fields
.field public value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 31

    .line 1
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v1, "TACHIKOMA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->TACHIKOMA:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 2
    new-instance v1, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v3, "AD_SPLASH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_SPLASH:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 3
    new-instance v3, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v5, "AD_INTERSTITIAL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v5}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_INTERSTITIAL:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 4
    new-instance v5, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v7, "AD_FULLSCREEN"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v7}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_FULLSCREEN:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 5
    new-instance v7, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v9, "AD_REWARD"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v9}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_REWARD:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 6
    new-instance v9, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v11, "AD_FEED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v11}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 7
    new-instance v11, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v13, "AD_NATIVE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v13}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_NATIVE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 8
    new-instance v13, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v15, "AD_DRAW"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v15}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_DRAW:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 9
    new-instance v15, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v14, "CU_SLIDE"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v14}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v15, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 10
    new-instance v14, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v12, "CU_PROFILE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v12}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_PROFILE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 11
    new-instance v12, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v10, "CU_PROFILE_SLIDE"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8, v10}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_PROFILE_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 12
    new-instance v10, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v8, "CU_FEED"

    const/16 v6, 0xb

    const-string v4, "CU_FEED"

    invoke-direct {v10, v8, v6, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 13
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_FEED_SLIDE"

    const/16 v8, 0xc

    const-string v2, "CU_FEED_SLIDE"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_FEED_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 14
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_HOTSPOT_ENTRY"

    const/16 v8, 0xd

    move-object/from16 v16, v4

    const-string v4, "CU_HOTSPOT_ENTRY"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_HOTSPOT_ENTRY:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 15
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_HOTSPOT_SLIDE"

    const/16 v8, 0xe

    move-object/from16 v17, v2

    const-string v2, "CU_HOTSPOT_SLIDE"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_HOTSPOT_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 16
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_HORIZONTAL_FEED"

    const/16 v8, 0xf

    move-object/from16 v18, v4

    const-string v4, "CU_HORIZONTAL_FEED"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_HORIZONTAL_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 17
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_VIDEO_DETAIL"

    const/16 v8, 0x10

    move-object/from16 v19, v2

    const-string v2, "CU_VIDEO_DETAIL"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_VIDEO_DETAIL:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 18
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_IMAGE_TEXT_FEED"

    const/16 v8, 0x11

    move-object/from16 v20, v4

    const-string v4, "CU_IMAGE_TEXT_FEED"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_IMAGE_TEXT_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 19
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_IMAGE_TEXT_DETAIL"

    const/16 v8, 0x12

    move-object/from16 v21, v2

    const-string v2, "CU_IMAGE_TEXT_DETAIL"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_IMAGE_TEXT_DETAIL:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 20
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_WALLPAPER_FEED"

    const/16 v8, 0x13

    move-object/from16 v22, v4

    const-string v4, "CU_WALLPAPER_FEED"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_WALLPAPER_FEED:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 21
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "CU_WALLPAPER_SLIDE"

    const/16 v8, 0x14

    move-object/from16 v23, v2

    const-string v2, "CU_WALLPAPER_SLIDE"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->CU_WALLPAPER_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 22
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "EU_LIVE_SLIDE"

    const/16 v8, 0x15

    move-object/from16 v24, v4

    const-string v4, "EU_LIVE_SLIDE"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->EU_LIVE_SLIDE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 23
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "EU_LIVE_REPLAY"

    const/16 v8, 0x16

    move-object/from16 v25, v2

    const-string v2, "EU_LIVE_REPLAY"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->EU_LIVE_REPLAY:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 24
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "WEB_CACHE"

    const/16 v8, 0x17

    move-object/from16 v26, v4

    const-string v4, "WEB_CACHE"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->WEB_CACHE:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 25
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "AD_SDK_INIT"

    const/16 v8, 0x18

    move-object/from16 v27, v2

    const-string v2, "AD_SDK_INIT"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_SDK_INIT:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 26
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "AD_WEBVIEW"

    const/16 v8, 0x19

    move-object/from16 v28, v4

    const-string v4, "AD_WEBVIEW"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_WEBVIEW:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 27
    new-instance v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "AD_CONVERT"

    const/16 v8, 0x1a

    move-object/from16 v29, v2

    const-string v2, "AD_CONVERT"

    invoke-direct {v4, v6, v8, v2}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->AD_CONVERT:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    .line 28
    new-instance v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const-string v6, "OTHER"

    const/16 v8, 0x1b

    move-object/from16 v30, v4

    const-string v4, "OTHER"

    invoke-direct {v2, v6, v8, v4}, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->OTHER:Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const/16 v4, 0x1c

    new-array v4, v4, [Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    const/4 v6, 0x0

    aput-object v0, v4, v6

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v15, v4, v0

    const/16 v0, 0x9

    aput-object v14, v4, v0

    const/16 v0, 0xa

    aput-object v12, v4, v0

    const/16 v0, 0xb

    aput-object v10, v4, v0

    const/16 v0, 0xc

    aput-object v16, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    const/16 v0, 0x10

    aput-object v20, v4, v0

    const/16 v0, 0x11

    aput-object v21, v4, v0

    const/16 v0, 0x12

    aput-object v22, v4, v0

    const/16 v0, 0x13

    aput-object v23, v4, v0

    const/16 v0, 0x14

    aput-object v24, v4, v0

    const/16 v0, 0x15

    aput-object v25, v4, v0

    const/16 v0, 0x16

    aput-object v26, v4, v0

    const/16 v0, 0x17

    aput-object v27, v4, v0

    const/16 v0, 0x18

    aput-object v28, v4, v0

    const/16 v0, 0x19

    aput-object v29, v4, v0

    const/16 v0, 0x1a

    aput-object v30, v4, v0

    const/16 v0, 0x1b

    aput-object v2, v4, v0

    .line 29
    sput-object v4, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->$VALUES:[Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;
    .locals 1

    .line 1
    const-class v0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    return-object p0
.end method

.method public static values()[Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->$VALUES:[Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    invoke-virtual {v0}, [Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kwai/adclient/kscommerciallogger/model/BusinessType;

    return-object v0
.end method
