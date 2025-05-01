.class public final Lcom/join/kotlin/discount/model/bean/GameDetailBean;
.super Lcom/join/mgps/dto/DownloadPointBase;
.source "GameDetailBean.kt"


# instance fields
.field private ad:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private benefits:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private comment_number:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private game_icon:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private game_id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private game_name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private has648:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private recycle_number:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sell_number:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private similarity_game_names:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/SimilarGameBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sub_titles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tagName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private top_bg_color:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private trading_number:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private transaction_info:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailSubAccountBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 25

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x3fffff

    const/16 v24, 0x0

    invoke-direct/range {v0 .. v24}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;-><init>(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;",
            "Lcom/join/kotlin/discount/model/bean/CommonComponentBean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/join/kotlin/discount/model/bean/CommonComponentBean;",
            "Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;",
            "Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailSubAccountBean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/SimilarGameBean;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/dto/DownloadPointBase;-><init>()V

    move-object v1, p1

    .line 6
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    move-object v1, p2

    .line 7
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    move-object v1, p3

    .line 8
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    move-object v1, p4

    .line 9
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    move-object v1, p5

    .line 10
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    move-object v1, p6

    .line 11
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    move-object v1, p7

    .line 12
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    move-object v1, p8

    .line 13
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    move-object v1, p9

    .line 14
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    move-object v1, p10

    .line 15
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    move-object v1, p11

    .line 16
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    move-object v1, p12

    .line 17
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    move-object v1, p13

    .line 18
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    move-object/from16 v1, p14

    .line 19
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    move-object/from16 v1, p15

    .line 20
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    move-object/from16 v1, p16

    .line 21
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    move-object/from16 v1, p17

    .line 22
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 23
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 24
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 25
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    move-object/from16 v1, p21

    .line 26
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    move-object/from16 v1, p22

    .line 27
    iput-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    const-string v6, ""

    if-eqz v5, :cond_3

    move-object v5, v6

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v6

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move-object v8, v6

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    const/16 v16, 0x0

    if-eqz v15, :cond_c

    .line 1
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    move-object/from16 p1, v6

    and-int/lit16 v6, v0, 0x4000

    if-eqz v6, :cond_e

    const/4 v6, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v6, p15

    :goto_e
    const v17, 0x8000

    and-int v17, v0, v17

    if-eqz v17, :cond_f

    const/16 v17, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v17, p16

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    move-object/from16 v18, p1

    goto :goto_10

    :cond_10
    move-object/from16 v18, p17

    :goto_10
    const/high16 v19, 0x20000

    and-int v19, v0, v19

    if-eqz v19, :cond_11

    move-object/from16 v19, p1

    goto :goto_11

    :cond_11
    move-object/from16 v19, p18

    :goto_11
    const/high16 v20, 0x40000

    and-int v20, v0, v20

    if-eqz v20, :cond_12

    move-object/from16 v20, p1

    goto :goto_12

    :cond_12
    move-object/from16 v20, p19

    :goto_12
    const/high16 v21, 0x80000

    and-int v21, v0, v21

    if-eqz v21, :cond_13

    .line 2
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    goto :goto_13

    :cond_13
    move-object/from16 v21, p20

    :goto_13
    const/high16 v22, 0x100000

    and-int v22, v0, v22

    if-eqz v22, :cond_14

    .line 3
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    goto :goto_14

    :cond_14
    move-object/from16 v16, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v0, v0, v22

    if-eqz v0, :cond_15

    move-object/from16 v0, p1

    goto :goto_15

    :cond_15
    move-object/from16 v0, p22

    :goto_15
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, v2

    move-object/from16 p16, v6

    move-object/from16 p17, v17

    move-object/from16 p18, v18

    move-object/from16 p19, v19

    move-object/from16 p20, v20

    move-object/from16 p21, v21

    move-object/from16 p22, v16

    move-object/from16 p23, v0

    .line 4
    invoke-direct/range {p1 .. p23}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;-><init>(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/discount/model/bean/GameDetailBean;Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/join/kotlin/discount/model/bean/GameDetailBean;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v1, v1, v16

    if-eqz v1, :cond_15

    iget-object v1, v0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p21, v15

    move-object/from16 p22, v1

    invoke-virtual/range {p0 .. p22}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->copy(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final activeNoticeCountStr()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;->getActiveNoticeCount()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-eqz v0, :cond_3

    goto :goto_3

    .line 2
    :cond_3
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;->getActiveNoticeCount()Ljava/lang/String;

    move-result-object v1

    :cond_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    :goto_3
    const-string v0, "0"

    :goto_4
    return-object v0
.end method

.method public final component1()Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    return-object v0
.end method

.method public final component10()Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailSubAccountBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/SimilarGameBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    return-object v0
.end method

.method public final component20()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component21()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    return-object v0
.end method

.method public final component8()Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    return-object v0
.end method

.method public final component9()Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    return-object v0
.end method

.method public final copy(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/join/kotlin/discount/model/bean/GameDetailBean;
    .locals 24
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;",
            "Lcom/join/kotlin/discount/model/bean/CommonComponentBean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/join/kotlin/discount/model/bean/CommonComponentBean;",
            "Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;",
            "Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;",
            "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailSubAccountBean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/SimilarGameBean;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBean;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    new-instance v23, Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    move-object/from16 v0, v23

    invoke-direct/range {v0 .. v22}, Lcom/join/kotlin/discount/model/bean/GameDetailBean;-><init>(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/join/kotlin/discount/model/bean/CommonComponentBean;Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v23
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    iget-object p1, p1, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getAd()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    return-object v0
.end method

.method public final getBasic_info()Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    return-object v0
.end method

.method public final getBenefits()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    return-object v0
.end method

.method public final getBooking_info()Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    return-object v0
.end method

.method public final getComment_number()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoupon_info()Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    return-object v0
.end method

.method public final getGame_icon()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getGame_id()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getGame_name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    return-object v0
.end method

.method public final getGame_notice_info()Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    return-object v0
.end method

.method public final getGame_server_info()Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    return-object v0
.end method

.method public final getGift_info()Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    return-object v0
.end method

.method public final getHas648()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPic_video_info()Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    return-object v0
.end method

.method public final getRecycle_number()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSell_number()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSimilarity_game_names()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/SimilarGameBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    return-object v0
.end method

.method public final getSub_titles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    return-object v0
.end method

.method public final getTagForAppDl(I)Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const/4 v4, 0x0

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    add-int/lit8 v5, p1, 0x1

    if-lt v1, v5, :cond_6

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    if-eqz v1, :cond_3

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;

    goto :goto_3

    :cond_3
    move-object v1, v4

    :goto_3
    if-eqz v1, :cond_6

    .line 3
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    if-eqz v1, :cond_5

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    move-object v0, p1

    :cond_5
    :goto_4
    return-object v0

    .line 4
    :cond_6
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    if-eqz v1, :cond_b

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getTags()Ljava/util/List;

    move-result-object v4

    :cond_7
    if-eqz v4, :cond_8

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    const/4 v2, 0x1

    :cond_9
    if-nez v2, :cond_b

    .line 5
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->getTags()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/discount/model/bean/TagBean;

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/TagBean;->getName()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_a

    goto :goto_5

    :cond_a
    move-object v0, p1

    :catch_0
    :cond_b
    :goto_5
    return-object v0
.end method

.method public final getTagName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTop_bg_color()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrading_number()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    return-object v0
.end method

.method public final getTransaction_info()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailSubAccountBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/CommonComponentBean;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/CommonComponentBean;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    if-nez v2, :cond_10

    const/4 v2, 0x0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    if-nez v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    if-nez v2, :cond_14

    const/4 v2, 0x0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    if-nez v2, :cond_15

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    return v0
.end method

.method public final serverInfoAvailable()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final setAd(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    return-void
.end method

.method public final setBasic_info(Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    return-void
.end method

.method public final setBenefits(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    return-void
.end method

.method public final setBooking_info(Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    return-void
.end method

.method public final setComment_number(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    return-void
.end method

.method public final setCoupon_info(Lcom/join/kotlin/discount/model/bean/CommonComponentBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    return-void
.end method

.method public final setGame_icon(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    return-void
.end method

.method public final setGame_id(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    return-void
.end method

.method public final setGame_name(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    return-void
.end method

.method public final setGame_notice_info(Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    return-void
.end method

.method public final setGame_server_info(Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    return-void
.end method

.method public final setGift_info(Lcom/join/kotlin/discount/model/bean/CommonComponentBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommonComponentBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    return-void
.end method

.method public final setHas648(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    return-void
.end method

.method public final setPic_video_info(Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    return-void
.end method

.method public final setRecycle_number(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    return-void
.end method

.method public final setSell_number(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    return-void
.end method

.method public final setSimilarity_game_names(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/SimilarGameBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    return-void
.end method

.method public final setSub_titles(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/StreamingGameTagBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    return-void
.end method

.method public final setTagName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    return-void
.end method

.method public final setTop_bg_color(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    return-void
.end method

.method public final setTrading_number(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    return-void
.end method

.method public final setTransaction_info(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailSubAccountBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    return-void
.end method

.method public final showAd()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v0, 0x1

    :goto_4
    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    :goto_5
    return v1
.end method

.method public final showBenefits()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final showDiscount()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final showEvent()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;->getJumpListUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    return v1
.end method

.method public final showNoticeCount()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;->getActiveNoticeCount()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    return v1
.end method

.method public final showSimilarGames()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GameDetailBean(basic_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->basic_info:Lcom/join/kotlin/discount/model/bean/GameDetailBasicInfoBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", booking_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->booking_info:Lcom/join/kotlin/discount/model/bean/GameDetailBookingInfoBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coupon_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->coupon_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", game_icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_icon:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", game_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", game_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gift_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->gift_info:Lcom/join/kotlin/discount/model/bean/CommonComponentBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pic_video_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->pic_video_info:Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", game_notice_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_notice_info:Lcom/join/kotlin/discount/model/bean/GameDetailNoticeBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", game_server_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->game_server_info:Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transaction_info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->transaction_info:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", benefits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->benefits:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", has648="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->has648:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->ad:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sub_titles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sub_titles:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", similarity_game_names="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->similarity_game_names:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", comment_number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->comment_number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trading_number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->trading_number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", top_bg_color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->top_bg_color:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", recycle_number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->recycle_number:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sell_number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->sell_number:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailBean;->tagName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
