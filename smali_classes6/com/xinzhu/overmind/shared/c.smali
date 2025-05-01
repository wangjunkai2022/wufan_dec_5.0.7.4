.class public final synthetic Lcom/xinzhu/overmind/shared/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/xinzhu/overmind/shared/OMProxyActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/xinzhu/overmind/shared/OMProxyActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xinzhu/overmind/shared/c;->b:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lcom/xinzhu/overmind/shared/c;->b:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    invoke-static {v0, p1, p2}, Lcom/xinzhu/overmind/shared/OMProxyActivity;->e0(Lcom/xinzhu/overmind/shared/OMProxyActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
