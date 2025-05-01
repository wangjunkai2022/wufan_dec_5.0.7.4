.class public final enum Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/monitor/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;",
        ">;",
        "Lcom/kwad/components/ad/reward/monitor/a;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum AD_CLICK:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum EXTRA_REWARD_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum PAGE_DISMISS:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum REWARD_STEP_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum REWARD_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum VIDEO_PLAY_END:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum VIDEO_PLAY_ERROR:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum VIDEO_PLAY_START:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

.field public static final enum VIDEO_SKIP_TO_END:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;


# instance fields
.field private typeValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v1, "AD_CLICK"

    const/4 v2, 0x0

    const-string v3, "ad_click"

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->AD_CLICK:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 2
    new-instance v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v3, "PAGE_DISMISS"

    const/4 v4, 0x1

    const-string v5, "page_close"

    invoke-direct {v1, v3, v4, v5}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->PAGE_DISMISS:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 3
    new-instance v3, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v5, "VIDEO_PLAY_ERROR"

    const/4 v6, 0x2

    const-string v7, "play_error"

    invoke-direct {v3, v5, v6, v7}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_PLAY_ERROR:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 4
    new-instance v5, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v7, "VIDEO_PLAY_END"

    const/4 v8, 0x3

    const-string v9, "play_end"

    invoke-direct {v5, v7, v8, v9}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_PLAY_END:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 5
    new-instance v7, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v9, "VIDEO_SKIP_TO_END"

    const/4 v10, 0x4

    const-string v11, "skip_to_end"

    invoke-direct {v7, v9, v10, v11}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_SKIP_TO_END:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 6
    new-instance v9, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v11, "VIDEO_PLAY_START"

    const/4 v12, 0x5

    const-string v13, "play_start"

    invoke-direct {v9, v11, v12, v13}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->VIDEO_PLAY_START:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 7
    new-instance v11, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v13, "REWARD_VERIFY"

    const/4 v14, 0x6

    const-string v15, "reward_verify"

    invoke-direct {v11, v13, v14, v15}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->REWARD_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 8
    new-instance v13, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v15, "REWARD_STEP_VERIFY"

    const/4 v14, 0x7

    const-string v12, "reward_step_verify"

    invoke-direct {v13, v15, v14, v12}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->REWARD_STEP_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    .line 9
    new-instance v12, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const-string v15, "EXTRA_REWARD_VERIFY"

    const/16 v14, 0x8

    const-string v10, "extra_reward_verify"

    invoke-direct {v12, v15, v14, v10}, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->EXTRA_REWARD_VERIFY:Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    const/16 v10, 0x9

    new-array v10, v10, [Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    aput-object v5, v10, v8

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    aput-object v12, v10, v14

    .line 10
    sput-object v10, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->$VALUES:[Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

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
    iput-object p3, p0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->typeValue:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    return-object p0
.end method

.method public static values()[Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->$VALUES:[Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    invoke-virtual {v0}, [Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;

    return-object v0
.end method


# virtual methods
.method public final getTypeValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/monitor/RewardInteractionCallbackType;->typeValue:Ljava/lang/String;

    return-object v0
.end method
