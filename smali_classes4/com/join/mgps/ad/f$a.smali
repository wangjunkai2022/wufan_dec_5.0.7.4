.class Lcom/join/mgps/ad/f$a;
.super Ljava/lang/Object;
.source "GDTInteractionRewardVideo.java"

# interfaces
.implements Lcom/qq/e/comm/listeners/NegativeFeedbackListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/ad/f;->h(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/ad/f;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/f$a;->a:Lcom/join/mgps/ad/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplainSuccess()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/f$a;->a:Lcom/join/mgps/ad/f;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    return-void
.end method
