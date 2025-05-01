.class Lcom/join/mgps/activity/SearchListActivity1_$a;
.super Ljava/lang/Object;
.source "SearchListActivity1_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchListActivity1_;->O0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/SearchListActivity1_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchListActivity1_;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchListActivity1_$a;->c:Lcom/join/mgps/activity/SearchListActivity1_;

    iput p2, p0, Lcom/join/mgps/activity/SearchListActivity1_$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SearchListActivity1_$a;->c:Lcom/join/mgps/activity/SearchListActivity1_;

    iget v1, p0, Lcom/join/mgps/activity/SearchListActivity1_$a;->b:I

    invoke-static {v0, v1}, Lcom/join/mgps/activity/SearchListActivity1_;->W0(Lcom/join/mgps/activity/SearchListActivity1_;I)V

    return-void
.end method
