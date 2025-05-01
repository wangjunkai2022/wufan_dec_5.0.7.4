.class Lcom/papa91/arc/ext/ToastManager$1;
.super Ljava/lang/Object;
.source "ToastManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$message:Ljava/lang/CharSequence;

.field final synthetic val$time:I


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/ext/ToastManager$1;->val$message:Ljava/lang/CharSequence;

    iput p2, p0, Lcom/papa91/arc/ext/ToastManager$1;->val$time:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/papa91/arc/ext/ToastManager;->access$000()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/papa91/arc/ext/ToastManager$1;->val$message:Ljava/lang/CharSequence;

    iget v2, p0, Lcom/papa91/arc/ext/ToastManager$1;->val$time:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Lcom/papa91/arc/ext/ToastManager;->show(Landroid/widget/Toast;)V

    return-void
.end method
