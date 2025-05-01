.class public Lcom/googlecode/mp4parser/h264/model/h;
.super Lcom/googlecode/mp4parser/h264/model/b;
.source "SeqParameterSet.java"


# instance fields
.field public A:Z

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:[I

.field public M:Lcom/googlecode/mp4parser/h264/model/i;

.field public N:Lcom/googlecode/mp4parser/h264/model/g;

.field public O:I

.field public a:I

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lcom/googlecode/mp4parser/h264/model/c;

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:I

.field public r:J

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/model/b;-><init>()V

    return-void
.end method

.method private static b(Lcom/googlecode/mp4parser/h264/read/b;)Lcom/googlecode/mp4parser/h264/model/i;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/i;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/h264/model/i;-><init>()V

    const-string v1, "VUI: aspect_ratio_info_present_flag"

    .line 2
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 3
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->a:Z

    const/16 v2, 0x8

    if-eqz v1, :cond_0

    const-string v1, "VUI: aspect_ratio"

    .line 4
    invoke-virtual {p0, v2, v1}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int v1, v3

    invoke-static {v1}, Lcom/googlecode/mp4parser/h264/model/a;->a(I)Lcom/googlecode/mp4parser/h264/model/a;

    move-result-object v1

    iput-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->y:Lcom/googlecode/mp4parser/h264/model/a;

    .line 5
    sget-object v3, Lcom/googlecode/mp4parser/h264/model/a;->b:Lcom/googlecode/mp4parser/h264/model/a;

    if-ne v1, v3, :cond_0

    const/16 v1, 0x10

    const-string v3, "VUI: sar_width"

    .line 6
    invoke-virtual {p0, v1, v3}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int v4, v3

    iput v4, v0, Lcom/googlecode/mp4parser/h264/model/i;->b:I

    const-string v3, "VUI: sar_height"

    .line 7
    invoke-virtual {p0, v1, v3}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int v1, v3

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->c:I

    :cond_0
    const-string v1, "VUI: overscan_info_present_flag"

    .line 8
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 9
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->d:Z

    if-eqz v1, :cond_1

    const-string v1, "VUI: overscan_appropriate_flag"

    .line 10
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 11
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->e:Z

    :cond_1
    const-string v1, "VUI: video_signal_type_present_flag"

    .line 12
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 13
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->f:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    const-string v3, "VUI: video_format"

    .line 14
    invoke-virtual {p0, v1, v3}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int v1, v3

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->g:I

    const-string v1, "VUI: video_full_range_flag"

    .line 15
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 16
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->h:Z

    const-string v1, "VUI: colour_description_present_flag"

    .line 17
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 18
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->i:Z

    if-eqz v1, :cond_2

    const-string v1, "VUI: colour_primaries"

    .line 19
    invoke-virtual {p0, v2, v1}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int v1, v3

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->j:I

    const-string v1, "VUI: transfer_characteristics"

    .line 20
    invoke-virtual {p0, v2, v1}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v3

    long-to-int v1, v3

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->k:I

    const-string v1, "VUI: matrix_coefficients"

    .line 21
    invoke-virtual {p0, v2, v1}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Lcom/googlecode/mp4parser/h264/model/i;->l:I

    :cond_2
    const-string v1, "VUI: chroma_loc_info_present_flag"

    .line 22
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 23
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->m:Z

    if-eqz v1, :cond_3

    const-string v1, "VUI chroma_sample_loc_type_top_field"

    .line 24
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 25
    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->n:I

    const-string v1, "VUI chroma_sample_loc_type_bottom_field"

    .line 26
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 27
    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->o:I

    :cond_3
    const-string v1, "VUI: timing_info_present_flag"

    .line 28
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 29
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->p:Z

    if-eqz v1, :cond_4

    const/16 v1, 0x20

    const-string v2, "VUI: num_units_in_tick"

    .line 30
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, v0, Lcom/googlecode/mp4parser/h264/model/i;->q:I

    const-string v2, "VUI: time_scale"

    .line 31
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Lcom/googlecode/mp4parser/h264/model/i;->r:I

    const-string v1, "VUI: fixed_frame_rate_flag"

    .line 32
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 33
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->s:Z

    :cond_4
    const-string v1, "VUI: nal_hrd_parameters_present_flag"

    .line 34
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 35
    invoke-static {p0}, Lcom/googlecode/mp4parser/h264/model/h;->d(Lcom/googlecode/mp4parser/h264/read/b;)Lcom/googlecode/mp4parser/h264/model/d;

    move-result-object v2

    iput-object v2, v0, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    :cond_5
    const-string v2, "VUI: vcl_hrd_parameters_present_flag"

    .line 36
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 37
    invoke-static {p0}, Lcom/googlecode/mp4parser/h264/model/h;->d(Lcom/googlecode/mp4parser/h264/read/b;)Lcom/googlecode/mp4parser/h264/model/d;

    move-result-object v3

    iput-object v3, v0, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    :cond_6
    if-nez v1, :cond_7

    if-eqz v2, :cond_8

    :cond_7
    const-string v1, "VUI: low_delay_hrd_flag"

    .line 38
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 39
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->t:Z

    :cond_8
    const-string v1, "VUI: pic_struct_present_flag"

    .line 40
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 41
    iput-boolean v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->u:Z

    const-string v1, "VUI: bitstream_restriction_flag"

    .line 42
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 43
    new-instance v1, Lcom/googlecode/mp4parser/h264/model/i$a;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/h264/model/i$a;-><init>()V

    iput-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI: motion_vectors_over_pic_boundaries_flag"

    .line 44
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 45
    iput-boolean v2, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->a:Z

    .line 46
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI max_bytes_per_pic_denom"

    .line 47
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v2

    .line 48
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->b:I

    .line 49
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI max_bits_per_mb_denom"

    .line 50
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v2

    .line 51
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->c:I

    .line 52
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI log2_max_mv_length_horizontal"

    .line 53
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v2

    .line 54
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->d:I

    .line 55
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI log2_max_mv_length_vertical"

    .line 56
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v2

    .line 57
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->e:I

    .line 58
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI num_reorder_frames"

    .line 59
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v2

    .line 60
    iput v2, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->f:I

    .line 61
    iget-object v1, v0, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    const-string v2, "VUI max_dec_frame_buffering"

    .line 62
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result p0

    .line 63
    iput p0, v1, Lcom/googlecode/mp4parser/h264/model/i$a;->g:I

    :cond_9
    return-object v0
.end method

.method public static c(Ljava/io/InputStream;)Lcom/googlecode/mp4parser/h264/model/h;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/h264/read/b;

    invoke-direct {v0, p0}, Lcom/googlecode/mp4parser/h264/read/b;-><init>(Ljava/io/InputStream;)V

    .line 2
    new-instance p0, Lcom/googlecode/mp4parser/h264/model/h;

    invoke-direct {p0}, Lcom/googlecode/mp4parser/h264/model/h;-><init>()V

    const/16 v1, 0x8

    const-string v2, "SPS: profile_idc"

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, p0, Lcom/googlecode/mp4parser/h264/model/h;->q:I

    const-string v2, "SPS: constraint_set_0_flag"

    .line 4
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 5
    iput-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->s:Z

    const-string v2, "SPS: constraint_set_1_flag"

    .line 6
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 7
    iput-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->t:Z

    const-string v2, "SPS: constraint_set_2_flag"

    .line 8
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 9
    iput-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->u:Z

    const-string v2, "SPS: constraint_set_3_flag"

    .line 10
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 11
    iput-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->v:Z

    const-string v2, "SPS: constraint_set_4_flag"

    .line 12
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 13
    iput-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->w:Z

    const-string v2, "SPS: constraint_set_5_flag"

    .line 14
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    .line 15
    iput-boolean v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->x:Z

    const/4 v2, 0x2

    const-string v3, "SPS: reserved_zero_2bits"

    .line 16
    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->r:J

    const-string v2, "SPS: level_idc"

    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->y:I

    const-string v1, "SPS: seq_parameter_set_id"

    .line 18
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->z:I

    .line 19
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->q:I

    const/16 v2, 0x64

    if-eq v1, v2, :cond_1

    const/16 v2, 0x6e

    if-eq v1, v2, :cond_1

    const/16 v2, 0x7a

    if-eq v1, v2, :cond_1

    const/16 v2, 0x90

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    sget-object v1, Lcom/googlecode/mp4parser/h264/model/c;->e:Lcom/googlecode/mp4parser/h264/model/c;

    iput-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    goto :goto_1

    :cond_1
    :goto_0
    const-string v1, "SPS: chroma_format_idc"

    .line 21
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 22
    invoke-static {v1}, Lcom/googlecode/mp4parser/h264/model/c;->a(I)Lcom/googlecode/mp4parser/h264/model/c;

    move-result-object v1

    iput-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    .line 23
    sget-object v2, Lcom/googlecode/mp4parser/h264/model/c;->g:Lcom/googlecode/mp4parser/h264/model/c;

    if-ne v1, v2, :cond_2

    const-string v1, "SPS: residual_color_transform_flag"

    .line 24
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 25
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->A:Z

    :cond_2
    const-string v1, "SPS: bit_depth_luma_minus8"

    .line 26
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 27
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->n:I

    const-string v1, "SPS: bit_depth_chroma_minus8"

    .line 28
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 29
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->o:I

    const-string v1, "SPS: qpprime_y_zero_transform_bypass_flag"

    .line 30
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 31
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->p:Z

    const-string v1, "SPS: seq_scaling_matrix_present_lag"

    .line 32
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 33
    invoke-static {v0, p0}, Lcom/googlecode/mp4parser/h264/model/h;->e(Lcom/googlecode/mp4parser/h264/read/b;Lcom/googlecode/mp4parser/h264/model/h;)V

    :cond_3
    :goto_1
    const-string v1, "SPS: log2_max_frame_num_minus4"

    .line 34
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 35
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->j:I

    const-string v1, "SPS: pic_order_cnt_type"

    .line 36
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->a:I

    if-nez v1, :cond_4

    const-string v1, "SPS: log2_max_pic_order_cnt_lsb_minus4"

    .line 37
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 38
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->k:I

    goto :goto_3

    :cond_4
    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    const-string v1, "SPS: delta_pic_order_always_zero_flag"

    .line 39
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 40
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->c:Z

    const-string v1, "SPS: offset_for_non_ref_pic"

    .line 41
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v1

    .line 42
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->B:I

    const-string v1, "SPS: offset_for_top_to_bottom_field"

    .line 43
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v1

    .line 44
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->C:I

    const-string v1, "SPS: num_ref_frames_in_pic_order_cnt_cycle"

    .line 45
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 46
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->O:I

    .line 47
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->L:[I

    const/4 v1, 0x0

    .line 48
    :goto_2
    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->O:I

    if-lt v1, v2, :cond_5

    goto :goto_3

    .line 49
    :cond_5
    iget-object v2, p0, Lcom/googlecode/mp4parser/h264/model/h;->L:[I

    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SPS: offsetForRefFrame ["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/googlecode/mp4parser/h264/read/b;->t(Ljava/lang/String;)I

    move-result v3

    .line 51
    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    const-string v1, "SPS: num_ref_frames"

    .line 52
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->D:I

    const-string v1, "SPS: gaps_in_frame_num_value_allowed_flag"

    .line 53
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 54
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->E:Z

    const-string v1, "SPS: pic_width_in_mbs_minus1"

    .line 55
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 56
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->m:I

    const-string v1, "SPS: pic_height_in_map_units_minus1"

    .line 57
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 58
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->l:I

    const-string v1, "SPS: frame_mbs_only_flag"

    .line 59
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->F:Z

    if-nez v1, :cond_7

    const-string v1, "SPS: mb_adaptive_frame_field_flag"

    .line 60
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 61
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->g:Z

    :cond_7
    const-string v1, "SPS: direct_8x8_inference_flag"

    .line 62
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    .line 63
    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->h:Z

    const-string v1, "SPS: frame_cropping_flag"

    .line 64
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->G:Z

    if-eqz v1, :cond_8

    const-string v1, "SPS: frame_crop_left_offset"

    .line 65
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 66
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->H:I

    const-string v1, "SPS: frame_crop_right_offset"

    .line 67
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 68
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->I:I

    const-string v1, "SPS: frame_crop_top_offset"

    .line 69
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 70
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->J:I

    const-string v1, "SPS: frame_crop_bottom_offset"

    .line 71
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    .line 72
    iput v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->K:I

    :cond_8
    const-string v1, "SPS: vui_parameters_present_flag"

    .line 73
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 74
    invoke-static {v0}, Lcom/googlecode/mp4parser/h264/model/h;->b(Lcom/googlecode/mp4parser/h264/read/b;)Lcom/googlecode/mp4parser/h264/model/i;

    move-result-object v1

    iput-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    .line 75
    :cond_9
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/read/b;->v()V

    return-object p0
.end method

.method private static d(Lcom/googlecode/mp4parser/h264/read/b;)Lcom/googlecode/mp4parser/h264/model/d;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/d;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/h264/model/d;-><init>()V

    const-string v1, "SPS: cpb_cnt_minus1"

    .line 2
    invoke-virtual {p0, v1}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/googlecode/mp4parser/h264/model/d;->a:I

    const/4 v1, 0x4

    const-string v2, "HRD: bit_rate_scale"

    .line 3
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, v0, Lcom/googlecode/mp4parser/h264/model/d;->b:I

    const-string v2, "HRD: cpb_size_scale"

    .line 4
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->c:I

    .line 5
    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/d;->a:I

    add-int/lit8 v2, v1, 0x1

    new-array v2, v2, [I

    iput-object v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->d:[I

    add-int/lit8 v2, v1, 0x1

    .line 6
    new-array v2, v2, [I

    iput-object v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->e:[I

    add-int/lit8 v1, v1, 0x1

    .line 7
    new-array v1, v1, [Z

    iput-object v1, v0, Lcom/googlecode/mp4parser/h264/model/d;->f:[Z

    const/4 v1, 0x0

    .line 8
    :goto_0
    iget v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->a:I

    if-le v1, v2, :cond_0

    const/4 v1, 0x5

    const-string v2, "HRD: initial_cpb_removal_delay_length_minus1"

    .line 9
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, v0, Lcom/googlecode/mp4parser/h264/model/d;->g:I

    const-string v2, "HRD: cpb_removal_delay_length_minus1"

    .line 10
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, v0, Lcom/googlecode/mp4parser/h264/model/d;->h:I

    const-string v2, "HRD: dpb_output_delay_length_minus1"

    .line 11
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v2

    long-to-int v3, v2

    iput v3, v0, Lcom/googlecode/mp4parser/h264/model/d;->i:I

    const-string v2, "HRD: time_offset_length"

    .line 12
    invoke-virtual {p0, v1, v2}, Lcom/googlecode/mp4parser/h264/read/b;->s(ILjava/lang/String;)J

    move-result-wide v1

    long-to-int p0, v1

    iput p0, v0, Lcom/googlecode/mp4parser/h264/model/d;->j:I

    return-object v0

    .line 13
    :cond_0
    iget-object v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->d:[I

    const-string v3, "HRD: bit_rate_value_minus1"

    .line 14
    invoke-virtual {p0, v3}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v3

    .line 15
    aput v3, v2, v1

    .line 16
    iget-object v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->e:[I

    const-string v3, "HRD: cpb_size_value_minus1"

    .line 17
    invoke-virtual {p0, v3}, Lcom/googlecode/mp4parser/h264/read/b;->y(Ljava/lang/String;)I

    move-result v3

    .line 18
    aput v3, v2, v1

    .line 19
    iget-object v2, v0, Lcom/googlecode/mp4parser/h264/model/d;->f:[Z

    const-string v3, "HRD: cbr_flag"

    invoke-virtual {p0, v3}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v3

    aput-boolean v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private static e(Lcom/googlecode/mp4parser/h264/read/b;Lcom/googlecode/mp4parser/h264/model/h;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/g;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/h264/model/g;-><init>()V

    iput-object v0, p1, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    const-string v2, "SPS: seqScalingListPresentFlag"

    .line 2
    invoke-virtual {p0, v2}, Lcom/googlecode/mp4parser/h264/read/b;->p(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 3
    iget-object v2, p1, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    new-array v3, v1, [Lcom/googlecode/mp4parser/h264/model/f;

    iput-object v3, v2, Lcom/googlecode/mp4parser/h264/model/g;->a:[Lcom/googlecode/mp4parser/h264/model/f;

    new-array v1, v1, [Lcom/googlecode/mp4parser/h264/model/f;

    .line 4
    iput-object v1, v2, Lcom/googlecode/mp4parser/h264/model/g;->b:[Lcom/googlecode/mp4parser/h264/model/f;

    const/4 v2, 0x6

    if-ge v0, v2, :cond_1

    const/16 v1, 0x10

    .line 5
    invoke-static {p0, v1}, Lcom/googlecode/mp4parser/h264/model/f;->a(Lcom/googlecode/mp4parser/h264/read/b;I)Lcom/googlecode/mp4parser/h264/model/f;

    move-result-object v1

    aput-object v1, v3, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v0, -0x6

    const/16 v3, 0x40

    .line 6
    invoke-static {p0, v3}, Lcom/googlecode/mp4parser/h264/model/f;->a(Lcom/googlecode/mp4parser/h264/read/b;I)Lcom/googlecode/mp4parser/h264/model/f;

    move-result-object v3

    aput-object v3, v1, v2

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private f(Lcom/googlecode/mp4parser/h264/model/d;Lh1/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/d;->a:I

    const-string v1, "HRD: cpb_cnt_minus1"

    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 2
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/d;->b:I

    int-to-long v0, v0

    const/4 v2, 0x4

    const-string v3, "HRD: bit_rate_scale"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 3
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/d;->c:I

    int-to-long v0, v0

    const-string v3, "HRD: cpb_size_scale"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget v1, p1, Lcom/googlecode/mp4parser/h264/model/d;->a:I

    if-le v0, v1, :cond_0

    .line 5
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/d;->g:I

    int-to-long v0, v0

    const/4 v2, 0x5

    const-string v3, "HRD: initial_cpb_removal_delay_length_minus1"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 6
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/d;->h:I

    int-to-long v0, v0

    const-string v3, "HRD: cpb_removal_delay_length_minus1"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 7
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/d;->i:I

    int-to-long v0, v0

    const-string v3, "HRD: dpb_output_delay_length_minus1"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 8
    iget p1, p1, Lcom/googlecode/mp4parser/h264/model/d;->j:I

    int-to-long v0, p1

    const-string p1, "HRD: time_offset_length"

    invoke-virtual {p2, v0, v1, v2, p1}, Lh1/b;->h(JILjava/lang/String;)V

    return-void

    .line 9
    :cond_0
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/d;->d:[I

    aget v1, v1, v0

    const-string v2, "HRD: "

    invoke-virtual {p2, v1, v2}, Lh1/b;->o(ILjava/lang/String;)V

    .line 10
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/d;->e:[I

    aget v1, v1, v0

    invoke-virtual {p2, v1, v2}, Lh1/b;->o(ILjava/lang/String;)V

    .line 11
    iget-object v1, p1, Lcom/googlecode/mp4parser/h264/model/d;->f:[Z

    aget-boolean v1, v1, v0

    invoke-virtual {p2, v1, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private g(Lcom/googlecode/mp4parser/h264/model/i;Lh1/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->a:Z

    const-string v1, "VUI: aspect_ratio_info_present_flag"

    invoke-virtual {p2, v0, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 2
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->a:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->y:Lcom/googlecode/mp4parser/h264/model/a;

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/h264/model/a;->b()I

    move-result v0

    int-to-long v2, v0

    const-string v0, "VUI: aspect_ratio"

    invoke-virtual {p2, v2, v3, v1, v0}, Lh1/b;->h(JILjava/lang/String;)V

    .line 4
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->y:Lcom/googlecode/mp4parser/h264/model/a;

    sget-object v2, Lcom/googlecode/mp4parser/h264/model/a;->b:Lcom/googlecode/mp4parser/h264/model/a;

    if-ne v0, v2, :cond_0

    .line 5
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->b:I

    int-to-long v2, v0

    const/16 v0, 0x10

    const-string v4, "VUI: sar_width"

    invoke-virtual {p2, v2, v3, v0, v4}, Lh1/b;->h(JILjava/lang/String;)V

    .line 6
    iget v2, p1, Lcom/googlecode/mp4parser/h264/model/i;->c:I

    int-to-long v2, v2

    const-string v4, "VUI: sar_height"

    invoke-virtual {p2, v2, v3, v0, v4}, Lh1/b;->h(JILjava/lang/String;)V

    .line 7
    :cond_0
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->d:Z

    const-string v2, "VUI: overscan_info_present_flag"

    invoke-virtual {p2, v0, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 8
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->d:Z

    if-eqz v0, :cond_1

    .line 9
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->e:Z

    const-string v2, "VUI: overscan_appropriate_flag"

    invoke-virtual {p2, v0, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 10
    :cond_1
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->f:Z

    const-string v2, "VUI: video_signal_type_present_flag"

    invoke-virtual {p2, v0, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 11
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->f:Z

    if-eqz v0, :cond_2

    .line 12
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->g:I

    int-to-long v2, v0

    const/4 v0, 0x3

    const-string v4, "VUI: video_format"

    invoke-virtual {p2, v2, v3, v0, v4}, Lh1/b;->h(JILjava/lang/String;)V

    .line 13
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->h:Z

    const-string v2, "VUI: video_full_range_flag"

    invoke-virtual {p2, v0, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 14
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->i:Z

    const-string v2, "VUI: colour_description_present_flag"

    invoke-virtual {p2, v0, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 15
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->i:Z

    if-eqz v0, :cond_2

    .line 16
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->j:I

    int-to-long v2, v0

    const-string v0, "VUI: colour_primaries"

    invoke-virtual {p2, v2, v3, v1, v0}, Lh1/b;->h(JILjava/lang/String;)V

    .line 17
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->k:I

    int-to-long v2, v0

    const-string v0, "VUI: transfer_characteristics"

    invoke-virtual {p2, v2, v3, v1, v0}, Lh1/b;->h(JILjava/lang/String;)V

    .line 18
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->l:I

    int-to-long v2, v0

    const-string v0, "VUI: matrix_coefficients"

    invoke-virtual {p2, v2, v3, v1, v0}, Lh1/b;->h(JILjava/lang/String;)V

    .line 19
    :cond_2
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->m:Z

    const-string v1, "VUI: chroma_loc_info_present_flag"

    invoke-virtual {p2, v0, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 20
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->m:Z

    if-eqz v0, :cond_3

    .line 21
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->n:I

    const-string v1, "VUI: chroma_sample_loc_type_top_field"

    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 22
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->o:I

    const-string v1, "VUI: chroma_sample_loc_type_bottom_field"

    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 23
    :cond_3
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->p:Z

    const-string v1, "VUI: timing_info_present_flag"

    invoke-virtual {p2, v0, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 24
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->p:Z

    if-eqz v0, :cond_4

    .line 25
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->q:I

    int-to-long v0, v0

    const/16 v2, 0x20

    const-string v3, "VUI: num_units_in_tick"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 26
    iget v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->r:I

    int-to-long v0, v0

    const-string v3, "VUI: time_scale"

    invoke-virtual {p2, v0, v1, v2, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 27
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->s:Z

    const-string v1, "VUI: fixed_frame_rate_flag"

    invoke-virtual {p2, v0, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 28
    :cond_4
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    const-string v3, "VUI: "

    invoke-virtual {p2, v0, v3}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 29
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v0, :cond_6

    .line 30
    invoke-direct {p0, v0, p2}, Lcom/googlecode/mp4parser/h264/model/h;->f(Lcom/googlecode/mp4parser/h264/model/d;Lh1/b;)V

    .line 31
    :cond_6
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p2, v0, v3}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 32
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v0, :cond_8

    .line 33
    invoke-direct {p0, v0, p2}, Lcom/googlecode/mp4parser/h264/model/h;->f(Lcom/googlecode/mp4parser/h264/model/d;Lh1/b;)V

    .line 34
    :cond_8
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->v:Lcom/googlecode/mp4parser/h264/model/d;

    if-nez v0, :cond_9

    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->w:Lcom/googlecode/mp4parser/h264/model/d;

    if-eqz v0, :cond_a

    .line 35
    :cond_9
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->t:Z

    const-string v4, "VUI: low_delay_hrd_flag"

    invoke-virtual {p2, v0, v4}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 36
    :cond_a
    iget-boolean v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->u:Z

    const-string v4, "VUI: pic_struct_present_flag"

    invoke-virtual {p2, v0, v4}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 37
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    if-eqz v0, :cond_b

    goto :goto_2

    :cond_b
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p2, v1, v3}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 38
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    if-eqz v0, :cond_c

    .line 39
    iget-boolean v0, v0, Lcom/googlecode/mp4parser/h264/model/i$a;->a:Z

    const-string v1, "VUI: motion_vectors_over_pic_boundaries_flag"

    .line 40
    invoke-virtual {p2, v0, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 41
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/i$a;->b:I

    const-string v1, "VUI: max_bytes_per_pic_denom"

    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 42
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/i$a;->c:I

    const-string v1, "VUI: max_bits_per_mb_denom"

    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 43
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/i$a;->d:I

    const-string v1, "VUI: log2_max_mv_length_horizontal"

    .line 44
    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 45
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/i$a;->e:I

    const-string v1, "VUI: log2_max_mv_length_vertical"

    .line 46
    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 47
    iget-object v0, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    iget v0, v0, Lcom/googlecode/mp4parser/h264/model/i$a;->f:I

    const-string v1, "VUI: num_reorder_frames"

    invoke-virtual {p2, v0, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 48
    iget-object p1, p1, Lcom/googlecode/mp4parser/h264/model/i;->x:Lcom/googlecode/mp4parser/h264/model/i$a;

    iget p1, p1, Lcom/googlecode/mp4parser/h264/model/i$a;->g:I

    const-string v0, "VUI: max_dec_frame_buffering"

    invoke-virtual {p2, p1, v0}, Lh1/b;->o(ILjava/lang/String;)V

    :cond_c
    return-void
.end method


# virtual methods
.method public a(Ljava/io/OutputStream;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lh1/b;

    invoke-direct {v0, p1}, Lh1/b;-><init>(Ljava/io/OutputStream;)V

    .line 2
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->q:I

    int-to-long v1, p1

    const/16 p1, 0x8

    const-string v3, "SPS: profile_idc"

    invoke-virtual {v0, v1, v2, p1, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 3
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->s:Z

    const-string v2, "SPS: constraint_set_0_flag"

    invoke-virtual {v0, v1, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 4
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->t:Z

    const-string v2, "SPS: constraint_set_1_flag"

    invoke-virtual {v0, v1, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 5
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->u:Z

    const-string v2, "SPS: constraint_set_2_flag"

    invoke-virtual {v0, v1, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 6
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->v:Z

    const-string v2, "SPS: constraint_set_3_flag"

    invoke-virtual {v0, v1, v2}, Lh1/b;->g(ZLjava/lang/String;)V

    const-wide/16 v1, 0x0

    const/4 v3, 0x4

    const-string v4, "SPS: reserved"

    .line 7
    invoke-virtual {v0, v1, v2, v3, v4}, Lh1/b;->h(JILjava/lang/String;)V

    .line 8
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->y:I

    int-to-long v1, v1

    const-string v3, "SPS: level_idc"

    invoke-virtual {v0, v1, v2, p1, v3}, Lh1/b;->h(JILjava/lang/String;)V

    .line 9
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->z:I

    const-string v2, "SPS: seq_parameter_set_id"

    invoke-virtual {v0, v1, v2}, Lh1/b;->o(ILjava/lang/String;)V

    .line 10
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->q:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "SPS: "

    const/16 v5, 0x64

    if-eq v1, v5, :cond_0

    const/16 v5, 0x6e

    if-eq v1, v5, :cond_0

    const/16 v5, 0x7a

    if-eq v1, v5, :cond_0

    const/16 v5, 0x90

    if-ne v1, v5, :cond_8

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/h264/model/c;->b()I

    move-result v1

    const-string v5, "SPS: chroma_format_idc"

    invoke-virtual {v0, v1, v5}, Lh1/b;->o(ILjava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    sget-object v5, Lcom/googlecode/mp4parser/h264/model/c;->g:Lcom/googlecode/mp4parser/h264/model/c;

    if-ne v1, v5, :cond_1

    .line 13
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->A:Z

    const-string v5, "SPS: residual_color_transform_flag"

    invoke-virtual {v0, v1, v5}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 14
    :cond_1
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->n:I

    invoke-virtual {v0, v1, v4}, Lh1/b;->o(ILjava/lang/String;)V

    .line 15
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->o:I

    invoke-virtual {v0, v1, v4}, Lh1/b;->o(ILjava/lang/String;)V

    .line 16
    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->p:Z

    const-string v5, "SPS: qpprime_y_zero_transform_bypass_flag"

    invoke-virtual {v0, v1, v5}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 17
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1, v4}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 18
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    :goto_1
    if-lt v1, p1, :cond_3

    goto :goto_5

    :cond_3
    const/4 v5, 0x6

    if-ge v1, v5, :cond_5

    .line 19
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/g;->a:[Lcom/googlecode/mp4parser/h264/model/f;

    aget-object v5, v5, v1

    if-eqz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    .line 20
    :goto_2
    invoke-virtual {v0, v5, v4}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 21
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/g;->a:[Lcom/googlecode/mp4parser/h264/model/f;

    aget-object v6, v5, v1

    if-eqz v6, :cond_7

    .line 22
    aget-object v5, v5, v1

    invoke-virtual {v5, v0}, Lcom/googlecode/mp4parser/h264/model/f;->b(Lh1/b;)V

    goto :goto_4

    .line 23
    :cond_5
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/g;->b:[Lcom/googlecode/mp4parser/h264/model/f;

    add-int/lit8 v6, v1, -0x6

    aget-object v5, v5, v6

    if-eqz v5, :cond_6

    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    .line 24
    :goto_3
    invoke-virtual {v0, v5, v4}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 25
    iget-object v5, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    iget-object v5, v5, Lcom/googlecode/mp4parser/h264/model/g;->b:[Lcom/googlecode/mp4parser/h264/model/f;

    aget-object v7, v5, v6

    if-eqz v7, :cond_7

    .line 26
    aget-object v5, v5, v6

    invoke-virtual {v5, v0}, Lcom/googlecode/mp4parser/h264/model/f;->b(Lh1/b;)V

    :cond_7
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 27
    :cond_8
    :goto_5
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->j:I

    const-string v1, "SPS: log2_max_frame_num_minus4"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 28
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->a:I

    const-string v1, "SPS: pic_order_cnt_type"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 29
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->a:I

    if-nez p1, :cond_9

    .line 30
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->k:I

    const-string v1, "SPS: log2_max_pic_order_cnt_lsb_minus4"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    goto :goto_7

    :cond_9
    if-ne p1, v3, :cond_b

    .line 31
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->c:Z

    const-string v1, "SPS: delta_pic_order_always_zero_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 32
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->B:I

    const-string v1, "SPS: offset_for_non_ref_pic"

    invoke-virtual {v0, p1, v1}, Lh1/b;->i(ILjava/lang/String;)V

    .line 33
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->C:I

    const-string v1, "SPS: offset_for_top_to_bottom_field"

    invoke-virtual {v0, p1, v1}, Lh1/b;->i(ILjava/lang/String;)V

    .line 34
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->L:[I

    array-length p1, p1

    invoke-virtual {v0, p1, v4}, Lh1/b;->o(ILjava/lang/String;)V

    const/4 p1, 0x0

    .line 35
    :goto_6
    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->L:[I

    array-length v5, v1

    if-lt p1, v5, :cond_a

    goto :goto_7

    .line 36
    :cond_a
    aget v1, v1, p1

    invoke-virtual {v0, v1, v4}, Lh1/b;->i(ILjava/lang/String;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_6

    .line 37
    :cond_b
    :goto_7
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->D:I

    const-string v1, "SPS: num_ref_frames"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 38
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->E:Z

    const-string v1, "SPS: gaps_in_frame_num_value_allowed_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 39
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->m:I

    const-string v1, "SPS: pic_width_in_mbs_minus1"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 40
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->l:I

    const-string v1, "SPS: pic_height_in_map_units_minus1"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 41
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->F:Z

    const-string v1, "SPS: frame_mbs_only_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 42
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->F:Z

    if-nez p1, :cond_c

    .line 43
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->g:Z

    const-string v1, "SPS: mb_adaptive_frame_field_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 44
    :cond_c
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->h:Z

    const-string v1, "SPS: direct_8x8_inference_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 45
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->G:Z

    const-string v1, "SPS: frame_cropping_flag"

    invoke-virtual {v0, p1, v1}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 46
    iget-boolean p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->G:Z

    if-eqz p1, :cond_d

    .line 47
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->H:I

    const-string v1, "SPS: frame_crop_left_offset"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 48
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->I:I

    const-string v1, "SPS: frame_crop_right_offset"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 49
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->J:I

    const-string v1, "SPS: frame_crop_top_offset"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 50
    iget p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->K:I

    const-string v1, "SPS: frame_crop_bottom_offset"

    invoke-virtual {v0, p1, v1}, Lh1/b;->o(ILjava/lang/String;)V

    .line 51
    :cond_d
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    if-eqz p1, :cond_e

    const/4 v2, 0x1

    :cond_e
    invoke-virtual {v0, v2, v4}, Lh1/b;->g(ZLjava/lang/String;)V

    .line 52
    iget-object p1, p0, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    if-eqz p1, :cond_f

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/h264/model/h;->g(Lcom/googlecode/mp4parser/h264/model/i;Lh1/b;)V

    .line 54
    :cond_f
    invoke-virtual {v0}, Lh1/b;->k()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SeqParameterSet{ \n        pic_order_cnt_type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        field_pic_flag="

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        delta_pic_order_always_zero_flag="

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        weighted_pred_flag="

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        weighted_bipred_idc="

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        entropy_coding_mode_flag="

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        mb_adaptive_frame_field_flag="

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        direct_8x8_inference_flag="

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        chroma_format_idc="

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->i:Lcom/googlecode/mp4parser/h264/model/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n        log2_max_frame_num_minus4="

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        log2_max_pic_order_cnt_lsb_minus4="

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        pic_height_in_map_units_minus1="

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        pic_width_in_mbs_minus1="

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        bit_depth_luma_minus8="

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        bit_depth_chroma_minus8="

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        qpprime_y_zero_transform_bypass_flag="

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->p:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        profile_idc="

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        constraint_set_0_flag="

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->s:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        constraint_set_1_flag="

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->t:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        constraint_set_2_flag="

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->u:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        constraint_set_3_flag="

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->v:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        constraint_set_4_flag="

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->w:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        constraint_set_5_flag="

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->x:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        level_idc="

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        seq_parameter_set_id="

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        residual_color_transform_flag="

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->A:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        offset_for_non_ref_pic="

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->B:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        offset_for_top_to_bottom_field="

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->C:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        num_ref_frames="

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->D:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        gaps_in_frame_num_value_allowed_flag="

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->E:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        frame_mbs_only_flag="

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        frame_cropping_flag="

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->G:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", \n        frame_crop_left_offset="

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->H:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        frame_crop_right_offset="

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->I:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        frame_crop_top_offset="

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->J:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        frame_crop_bottom_offset="

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->K:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \n        offsetForRefFrame="

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->L:[I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n        vuiParams="

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->M:Lcom/googlecode/mp4parser/h264/model/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n        scalingMatrix="

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->N:Lcom/googlecode/mp4parser/h264/model/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \n        num_ref_frames_in_pic_order_cnt_cycle="

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/h;->O:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
