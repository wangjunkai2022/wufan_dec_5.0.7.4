.class Lcom/join/mgps/activity/QuarkLoadingActivity$a;
.super Ljava/lang/Object;
.source "QuarkLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/QuarkLoadingActivity;->l0(Ljava/lang/String;ILjava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:I

.field final synthetic d:Lcom/join/mgps/activity/QuarkLoadingActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/QuarkLoadingActivity;Landroid/content/Intent;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;->d:Lcom/join/mgps/activity/QuarkLoadingActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;->b:Landroid/content/Intent;

    iput p3, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;->b:Landroid/content/Intent;

    iget v2, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;->c:I

    invoke-virtual {v0, v1, v2}, Lcom/xinzhu/overmind/Overmind;->startActivity(Landroid/content/Intent;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$a;->d:Lcom/join/mgps/activity/QuarkLoadingActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
