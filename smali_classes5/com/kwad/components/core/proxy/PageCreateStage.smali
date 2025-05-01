.class public final enum Lcom/kwad/components/core/proxy/PageCreateStage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kwad/components/core/proxy/PageCreateStage;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum END_CHILD_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum END_INIT_VIEW:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum END_LAUNCH:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum END_ON_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum END_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum ERROR_CAUGHT_EXCEPTION:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum ERROR_CHECK_INTENT:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum ERROR_SDK_NOT_INIT:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum ERROR_START_ACTIVITY:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_CHECK_INTENT:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_INIT_DATA:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_INIT_VIEW:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_LAUNCH:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_ON_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

.field public static final enum START_SET_CONTENT_VIEW:Lcom/kwad/components/core/proxy/PageCreateStage;


# instance fields
.field private final stage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v1, "START_LAUNCH"

    const/4 v2, 0x0

    const-string v3, "start_launch"

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/components/core/proxy/PageCreateStage;->START_LAUNCH:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 2
    new-instance v1, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v3, "END_LAUNCH"

    const/4 v4, 0x1

    const-string v5, "end_launch"

    invoke-direct {v1, v3, v4, v5}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/kwad/components/core/proxy/PageCreateStage;->END_LAUNCH:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 3
    new-instance v3, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v5, "START_ON_PRE_CREATE"

    const/4 v6, 0x2

    const-string v7, "start_on_pre_create"

    invoke-direct {v3, v5, v6, v7}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/kwad/components/core/proxy/PageCreateStage;->START_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 4
    new-instance v5, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v7, "END_ON_PRE_CREATE"

    const/4 v8, 0x3

    const-string v9, "end_on_pre_create"

    invoke-direct {v5, v7, v8, v9}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/kwad/components/core/proxy/PageCreateStage;->END_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 5
    new-instance v7, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v9, "END_CHILD_ON_PRE_CREATE"

    const/4 v10, 0x4

    const-string v11, "end_child_on_pre_create"

    invoke-direct {v7, v9, v10, v11}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/kwad/components/core/proxy/PageCreateStage;->END_CHILD_ON_PRE_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 6
    new-instance v9, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v11, "START_ON_CREATE"

    const/4 v12, 0x5

    const-string v13, "start_on_create"

    invoke-direct {v9, v11, v12, v13}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/kwad/components/core/proxy/PageCreateStage;->START_ON_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 7
    new-instance v11, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v13, "END_ON_CREATE"

    const/4 v14, 0x6

    const-string v15, "end_on_create"

    invoke-direct {v11, v13, v14, v15}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/kwad/components/core/proxy/PageCreateStage;->END_ON_CREATE:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 8
    new-instance v13, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "START_CHECK_INTENT"

    const/4 v14, 0x7

    const-string v12, "start_check_intent"

    invoke-direct {v13, v15, v14, v12}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/kwad/components/core/proxy/PageCreateStage;->START_CHECK_INTENT:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 9
    new-instance v12, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "START_SET_CONTENT_VIEW"

    const/16 v14, 0x8

    const-string v10, "start_set_content_view"

    invoke-direct {v12, v15, v14, v10}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/kwad/components/core/proxy/PageCreateStage;->START_SET_CONTENT_VIEW:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 10
    new-instance v10, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "START_INIT_DATA"

    const/16 v14, 0x9

    const-string v8, "start_init_data"

    invoke-direct {v10, v15, v14, v8}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/kwad/components/core/proxy/PageCreateStage;->START_INIT_DATA:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 11
    new-instance v8, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "START_INIT_VIEW"

    const/16 v14, 0xa

    const-string v6, "start_init_view"

    invoke-direct {v8, v15, v14, v6}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/kwad/components/core/proxy/PageCreateStage;->START_INIT_VIEW:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 12
    new-instance v6, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "ERROR_START_ACTIVITY"

    const/16 v14, 0xb

    const-string v4, "error_start_activity"

    invoke-direct {v6, v15, v14, v4}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/kwad/components/core/proxy/PageCreateStage;->ERROR_START_ACTIVITY:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 13
    new-instance v4, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "END_INIT_VIEW"

    const/16 v14, 0xc

    const-string v2, "end_init_view"

    invoke-direct {v4, v15, v14, v2}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwad/components/core/proxy/PageCreateStage;->END_INIT_VIEW:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 14
    new-instance v2, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "ERROR_SDK_NOT_INIT"

    const/16 v14, 0xd

    move-object/from16 v16, v4

    const-string v4, "error_not_init"

    invoke-direct {v2, v15, v14, v4}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwad/components/core/proxy/PageCreateStage;->ERROR_SDK_NOT_INIT:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 15
    new-instance v4, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "ERROR_CHECK_INTENT"

    const/16 v14, 0xe

    move-object/from16 v17, v2

    const-string v2, "error_check_data"

    invoke-direct {v4, v15, v14, v2}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/kwad/components/core/proxy/PageCreateStage;->ERROR_CHECK_INTENT:Lcom/kwad/components/core/proxy/PageCreateStage;

    .line 16
    new-instance v2, Lcom/kwad/components/core/proxy/PageCreateStage;

    const-string v15, "ERROR_CAUGHT_EXCEPTION"

    const/16 v14, 0xf

    move-object/from16 v18, v4

    const-string v4, "error_caught_exception"

    invoke-direct {v2, v15, v14, v4}, Lcom/kwad/components/core/proxy/PageCreateStage;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/kwad/components/core/proxy/PageCreateStage;->ERROR_CAUGHT_EXCEPTION:Lcom/kwad/components/core/proxy/PageCreateStage;

    const/16 v4, 0x10

    new-array v4, v4, [Lcom/kwad/components/core/proxy/PageCreateStage;

    const/4 v15, 0x0

    aput-object v0, v4, v15

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

    aput-object v12, v4, v0

    const/16 v0, 0x9

    aput-object v10, v4, v0

    const/16 v0, 0xa

    aput-object v8, v4, v0

    const/16 v0, 0xb

    aput-object v6, v4, v0

    const/16 v0, 0xc

    aput-object v16, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    aput-object v2, v4, v14

    .line 17
    sput-object v4, Lcom/kwad/components/core/proxy/PageCreateStage;->$VALUES:[Lcom/kwad/components/core/proxy/PageCreateStage;

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
    iput-object p3, p0, Lcom/kwad/components/core/proxy/PageCreateStage;->stage:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kwad/components/core/proxy/PageCreateStage;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/core/proxy/PageCreateStage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/core/proxy/PageCreateStage;

    return-object p0
.end method

.method public static values()[Lcom/kwad/components/core/proxy/PageCreateStage;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/proxy/PageCreateStage;->$VALUES:[Lcom/kwad/components/core/proxy/PageCreateStage;

    invoke-virtual {v0}, [Lcom/kwad/components/core/proxy/PageCreateStage;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kwad/components/core/proxy/PageCreateStage;

    return-object v0
.end method


# virtual methods
.method public final getStage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/proxy/PageCreateStage;->stage:Ljava/lang/String;

    return-object v0
.end method
