.class Lcom/join/mgps/activity/ShareWebActivity_$g;
.super Ljava/lang/Object;
.source "ShareWebActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ShareWebActivity_;->G1(Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/DomainInfoBean;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/join/mgps/activity/ShareWebActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ShareWebActivity_$g;->d:Lcom/join/mgps/activity/ShareWebActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/ShareWebActivity_$g;->b:Lcom/join/mgps/dto/DomainInfoBean;

    iput-object p3, p0, Lcom/join/mgps/activity/ShareWebActivity_$g;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ShareWebActivity_$g;->d:Lcom/join/mgps/activity/ShareWebActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/ShareWebActivity_$g;->b:Lcom/join/mgps/dto/DomainInfoBean;

    iget-object v2, p0, Lcom/join/mgps/activity/ShareWebActivity_$g;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ShareWebActivity_;->q2(Lcom/join/mgps/activity/ShareWebActivity_;Lcom/join/mgps/dto/DomainInfoBean;Ljava/lang/String;)V

    return-void
.end method
