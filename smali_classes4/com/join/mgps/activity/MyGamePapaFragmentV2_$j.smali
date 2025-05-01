.class Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;
.super Ljava/lang/Object;
.source "MyGamePapaFragmentV2_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->x1(Lcom/join/mgps/dto/SNKGameInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/SNKGameInfoBean;

.field final synthetic c:Lcom/join/mgps/activity/MyGamePapaFragmentV2_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/join/mgps/dto/SNKGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;->c:Lcom/join/mgps/activity/MyGamePapaFragmentV2_;

    iput-object p2, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;->b:Lcom/join/mgps/dto/SNKGameInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;->c:Lcom/join/mgps/activity/MyGamePapaFragmentV2_;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2_$j;->b:Lcom/join/mgps/dto/SNKGameInfoBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2_;->Y1(Lcom/join/mgps/activity/MyGamePapaFragmentV2_;Lcom/join/mgps/dto/SNKGameInfoBean;)V

    return-void
.end method
