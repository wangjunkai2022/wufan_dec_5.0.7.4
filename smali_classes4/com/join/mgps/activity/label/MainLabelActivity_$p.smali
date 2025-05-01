.class Lcom/join/mgps/activity/label/MainLabelActivity_$p;
.super Ljava/lang/Object;
.source "MainLabelActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/label/MainLabelActivity_;->D0(Lcom/join/mgps/dto/MainLabelBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/MainLabelBean;

.field final synthetic c:Lcom/join/mgps/activity/label/MainLabelActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/label/MainLabelActivity_;Lcom/join/mgps/dto/MainLabelBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity_$p;->c:Lcom/join/mgps/activity/label/MainLabelActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/label/MainLabelActivity_$p;->b:Lcom/join/mgps/dto/MainLabelBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity_$p;->c:Lcom/join/mgps/activity/label/MainLabelActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity_$p;->b:Lcom/join/mgps/dto/MainLabelBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/label/MainLabelActivity_;->G0(Lcom/join/mgps/activity/label/MainLabelActivity_;Lcom/join/mgps/dto/MainLabelBean;)V

    return-void
.end method
