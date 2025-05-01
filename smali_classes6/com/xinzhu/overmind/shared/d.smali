.class public final synthetic Lcom/xinzhu/overmind/shared/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:Lcom/xinzhu/overmind/shared/OMProxyActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/xinzhu/overmind/shared/OMProxyActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xinzhu/overmind/shared/d;->b:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcom/xinzhu/overmind/shared/d;->b:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    invoke-static {v0, p1}, Lcom/xinzhu/overmind/shared/OMProxyActivity;->f0(Lcom/xinzhu/overmind/shared/OMProxyActivity;Landroid/content/DialogInterface;)V

    return-void
.end method
