.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/dialog/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/j;->b:Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptCallback;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/j;->b:Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptCallback;

    invoke-static {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptNormalDialog;->d(Lcom/join/kotlin/ui/cloudarchive/dialog/ModPromptCallback;Landroid/view/View;)V

    return-void
.end method
