.class Lcom/join/mgps/activity/ForumMyActivity_$b;
.super Ljava/lang/Object;
.source "ForumMyActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/ForumMyActivity_;->m0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/ForumMyActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/ForumMyActivity_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/ForumMyActivity_$b;->b:Lcom/join/mgps/activity/ForumMyActivity_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/ForumMyActivity_$b;->b:Lcom/join/mgps/activity/ForumMyActivity_;

    invoke-static {v0}, Lcom/join/mgps/activity/ForumMyActivity_;->o0(Lcom/join/mgps/activity/ForumMyActivity_;)V

    return-void
.end method
