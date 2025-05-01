.class Lcom/join/mgps/activity/MGMainActivity$p0$a;
.super Ljava/lang/Object;
.source "MGMainActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity$p0;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MGMainActivity$p0;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity$p0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$p0$a;->b:Lcom/join/mgps/activity/MGMainActivity$p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$p0$a;->b:Lcom/join/mgps/activity/MGMainActivity$p0;

    iget-object v0, v0, Lcom/join/mgps/activity/MGMainActivity$p0;->b:Lcom/join/mgps/activity/MGMainActivity;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MGMainActivity;->access$602(Lcom/join/mgps/activity/MGMainActivity;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method
